/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private static final Scanner input = new Scanner(System.in);
    private final String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        //Initialize fields to constructor arguments
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public List<Product> convertJsonToProduct(String jsonFilePath) {
        List<Product> inventory = new ArrayList<>();

        //try
        try {
            //Create file object with json file path
            FileReader inFile = new FileReader(jsonFilePath);

            //obj = jsonParser(file object)
            JsonObject obj = (JsonObject)JsonParser.parseReader(inFile);

            //iterator = productJsonObj.get("products")
            JsonArray iterator = obj.getAsJsonArray("products");

            //for(amount of products in json file)
            for(int i = 0; i < iterator.size(); i++) {
                //products = iterator.get(i)
                JsonObject product = iterator.get(i).getAsJsonObject();

                //productTemp = new Product(nameTemp, priceTemp, quantityTemp)
                Product productTemp = new Product(product.get("name").getAsString(),
                        product.get("price").getAsDouble(), product.get("quantity").getAsInt());

                //inventory.add(productTemp)
                inventory.add(productTemp);
            }
        }//catch(Exception e)
        catch(Exception e) {
            //printStackTrace
            e.printStackTrace();
        }

        //return inventory
        return inventory;
    }

    public void searchForProduct(List<Product> inventory) {
        boolean itemFound = false;

        //while(!itemFound)
        while(!itemFound) {
            //print "What is the product name? "
            System.out.print("What is the product name? ");

            //productQuery = input
            String productQuery = input.nextLine();

            for(Product p: inventory) {
                //if(productQuery is in inventory)
                if (p.name.equals(productQuery)) {
                    //itemFound = true
                    itemFound = true;

                    //printItemInfo(product)
                    printItemInfo(p);
                }
            }
            if(!itemFound) {
                //print "Sorry, that product was not found in our inventory."
                System.out.println("Sorry, that product was not found in our inventory.");
            }

        }
    }

    private void printItemInfo(Product product) {
        //print "Name: product.name"
        System.out.printf("Name: %s%n", product.name);

        //print "Price: product.price"
        System.out.printf("Price: %.2f%n", product.price);

        //print "Quantity: product.quantity"
        System.out.printf("Quantity: %d%n", product.quantity);
    }
}

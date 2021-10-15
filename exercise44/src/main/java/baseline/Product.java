package baseline;

import java.util.List;
import java.util.Scanner;

public class Product {
    private static final Scanner input = new Scanner(System.in);
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        //Initialize fields to constructor arguments
    }

    public List<Product> convertJsonToProduct(String jsonText) {
        //Create jsonParser
        //nameTemp
        //priceTemp
        //quantityTemp
        //ArrayList inventory

        //try
            //Create file object with json file path
            //obj = jsonParser(file object)
            //productJsonObj = obj

            //iterator = productJsonObj.get("products")

            //for(amount of products in json file)
                //products = iterator.get(i)

                //nameTemp = name of product
                //priceTemp = price of product
                //quantityTemp = quantity of product

                //productTemp = new Product(nameTemp, priceTemp, quantityTemp)
                //inventory.add(productTemp)
        //catch(FileNotFoundException | IOException | ParseException | Exception e)
            //printStackTrace

        //return inventory
    }

    public void searchForProduct(List<Product> inventory) {
        //itemFound = false

        //while(!itemFound)
            //print "What is the product name? "
            //productQuery = input
            //if(productQuery is in inventory)
                //itemFound = true
                //printItemInfo(product)
            //else
                //print "Sorry, that product was not found in our inventory."
    }

    private void printItemInfo(Product item) {
        //print "Name: item.name"
        //print "Price: item.price"
        //print "Quantity: item.quantity"
    }
}

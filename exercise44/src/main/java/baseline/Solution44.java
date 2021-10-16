/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.ArrayList;
import java.util.List;

public class Solution44 {
    public static void main(String[] args) {
        Product manager = new Product("", 0.0, 0);

        //inventory (Array of Products)
        List<Product> inventory;

        //inventory = convertJsonToProduct
        inventory = manager.convertJsonToProduct("data/exercise44_input.json");

        //searchForProduct
        manager.searchForProduct(inventory);

    }

}

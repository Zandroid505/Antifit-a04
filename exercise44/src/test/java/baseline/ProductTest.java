/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void checkIfJsonWasConvertedIntoListCorrectlyForName() {
        Product productTest = new Product("", 0, 0);
        List<Product> actual;

        actual = productTest.convertJsonToProduct("data/testJsonFile.json");

        assertEquals( "iPad", actual.get(0).getName());
        assertEquals( "iPhone", actual.get(1).getName());
        assertEquals( "MacBook", actual.get(2).getName());

    }

    @Test
    void checkIfJsonWasConvertedIntoListCorrectlyForPrice() {
        Product productTest = new Product("", 0, 0);
        List<Product> actual;

        actual = productTest.convertJsonToProduct("data/testJsonFile.json");

        assertEquals( 500.00, actual.get(0).getPrice());
        assertEquals( 800.00, actual.get(1).getPrice());
        assertEquals( 1200.00, actual.get(2).getPrice());

    }

    @Test
    void checkIfJsonWasConvertedIntoListCorrectlyForQuantity() {
        Product productTest = new Product("", 0, 0);
        List<Product> actual;

        actual = productTest.convertJsonToProduct("data/testJsonFile.json");

        assertEquals( 5, actual.get(0).getQuantity());
        assertEquals( 5, actual.get(1).getQuantity());
        assertEquals( 10, actual.get(2).getQuantity());

    }
}
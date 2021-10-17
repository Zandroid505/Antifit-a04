/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

public class Solution41 {
    public static void main(String[] args) {
        //Create NameSorter object
        NameSorter sortManager = new NameSorter();

        //Call readFile method
        sortManager.readFile("data/exercise41_input.txt");
        //Call sortNames(getPeople()) method
        sortManager.sortNames(sortManager.getPeople());

        //Call outputSortedNames() method
        sortManager.outputSortedNames(sortManager.getPeople(), "data/exercise41_output.txt");
    }
}

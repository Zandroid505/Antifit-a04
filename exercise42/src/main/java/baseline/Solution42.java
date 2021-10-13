/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.io.File;

public class Solution42 {
    public static void main(String[] args) {
        //Create inFile object and specify path
        File inFile = new File("data/exercise42_input.txt");
        File outFile = new File("data/exercise42_output.txt");

        //Create DataParser object
        DataParser parsingPerson = new DataParser();

        //Call readInFile() and pass inFile to it
        parsingPerson.readInFile(inFile);

        //Call outputFormattedData() and pass outFile
        parsingPerson.outputFormattedData(outFile);
    }
}

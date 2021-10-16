/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> wordFrequency = new HashMap<>();

    public void readInFile(String inFilePath) {
        //Create File object using inFile for path

        //try(open input file)
            //while(there is text to read in file)
                //updateWordFrequency(inputFile word)
        //catch(IOException || NoSuchElementException || IllegalStateException e)
            //printStackTrace
    }

    private void updateWordFrequency(String word) {
        //if(word exists in wordFrequency)
            //Increment value in hashmap for corresponding key
        //else
            //Add word to hashmap
            //Change value to 1
    }

    public Map<String, Integer> sortMap() {
        //Create list from map wordFrequency

        //sort list

        //put sorted data in list into new hashmap

        //return hashmap
    }

    public void outputWordFrequency(Map<String, Integer> sortedWordFrequency) {
        //for(each word)
            //print "'word': "
            //for(word frequency)
                //print "*"
    }
}

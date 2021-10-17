/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.Map;

public class Solution46 {
    public static void main(String[] args) {
        //create wordCounter object
        WordCounter wordLover = new WordCounter();
        Map<String, Integer> sortedWordFrequency;

        //call readInFile(file path)
        wordLover.readInFile("data/exercise46_input.txt");
        //sortedWordFrequency = sortMap()
        sortedWordFrequency = wordLover.sortMap();

        //call outputWordFrequency
        wordLover.outputWordFrequency(sortedWordFrequency, "data/exercise46_output.txt");
    }
}

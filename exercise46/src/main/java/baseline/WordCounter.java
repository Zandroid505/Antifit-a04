/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class WordCounter {
    private Map<String, Integer> wordFrequency = new HashMap<>();

    public void readInFile(String inFilePath) {
        //Create File object using inFile for path
        File inFile = new File(inFilePath);

        //try(open input file)
        try(Scanner inputFile = new Scanner(inFile)) {
            //while(there is text to read in file)
            while(inputFile.hasNext()) {
                //updateWordFrequency(inputFile word)
                updateWordFrequency(inputFile.next());
            }
        }
        //catch(IOException || NoSuchElementException || IllegalStateException e)
        catch(IOException | NoSuchElementException | IllegalStateException e) {
            //printStackTrace
            e.printStackTrace();
        }
    }

    private void updateWordFrequency(String searchWord) {

        //if(word exists in wordFrequency)
        //Increment value in hashmap for corresponding key
        //Add word to hashmap
        //Change value to 1
        this.wordFrequency.merge(searchWord, 1, Integer::sum);

    }

    public Map<String, Integer> sortMap() {
        //Create list from map wordFrequency
        List<Map.Entry<String, Integer>> tempList = new LinkedList<>(this.wordFrequency.entrySet());

        //sort list
        tempList.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        HashMap<String, Integer> newMap = new LinkedHashMap<>();

        //put sorted data in list into new hashmap
        for(Map.Entry<String, Integer> m: tempList){
            newMap.put(m.getKey(), m.getValue());
        }

        //return hashmap
        return newMap;
    }

    public void outputWordFrequency(Map<String, Integer> sortedWordFrequency, String outFilePath) {
        try(Formatter outputFile = new Formatter(outFilePath)) {


            //for(each word)
            for (Map.Entry<String, Integer> m : sortedWordFrequency.entrySet()) {
                //print "'word': "
                System.out.printf("%s: ", m.getKey());
                outputFile.format("%s: ", m.getKey());

                //for(word frequency)
                for (int i = 0; i < m.getValue(); i++) {
                    //print "*"
                    System.out.print("*");
                    outputFile.format("%s", "*");
                }
                System.out.println();
                outputFile.format("%n");
            }
        }
        catch(SecurityException | FileNotFoundException | FormatterClosedException e){
            e.printStackTrace();
        }
    }
}

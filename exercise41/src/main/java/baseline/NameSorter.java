/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.*;

public class NameSorter {
    private int numPeople;
    private List<String> people = new ArrayList<>();
    //private Map<String, String> firstName = new HashMap<>();

    public NameSorter() {
        this.numPeople = 0;
    }

    public void readFile(){
        //try(open input file)
            //while(there are names to read in file)
                //Read Last name and first name into ArrayList
                //numPeople++
                //Use last name as key for first name in Map (numPeople used as index)
        //catch(IOException || NoSuchElementException || IllegalStateException e)
            //printStackTrace;
    }

    public List<String> getPeople() {
        return people;
    }

    public void sortNames(List people) {
        //sort(people)
    }

    public void outputSortedNames(List people) {
        //try(open output file)
                //print "Total of 'numPeople' names"
                //print "-----------------"
                //for(people)
                    //print "'people'"
        //catch(SecurityException || FileNotFoundException || FormatterClosedException e)
            //printStackTrace();
    }
}

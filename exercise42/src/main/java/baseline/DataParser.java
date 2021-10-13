/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DataParser {
    private List<String> lastNames = new ArrayList<>();
    private List<String> firstNames = new ArrayList<>();
    private List<Double> salaries = new ArrayList<>();

    public void readInFile(File inFile) {
        //try(open input file)
            //Parse data at comma

            //while(there is data)
                //read string into lastNames
                //read string into firstNames
                //read number into salaries
        //catch(IOException || NoSuchElementException || IllegalStateException e)
            //printStackTrace
    }

    public List<String> getLastNames() {
        return lastNames;
    }

    public List<String> getFirstNames() {
        return firstNames;
    }

    public List<Double> getSalaries() {
        return salaries;
    }

    public void outputFormattedData() {
        //try(open output file)
            //print "Last      First     Salary" (console and output file)
            //print "--------------------------"

            //for(amount of people)
                //print lastNames[i]
                //print firstNames[i]
                //print salaries[i]
        //catch(SecurityException || FileNotFoundException || FormatterClosedException e)
            //printStackTrace
    }
}

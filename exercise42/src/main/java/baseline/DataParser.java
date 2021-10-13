/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class DataParser {
    private List<String> lastNames = new ArrayList<>();
    private List<String> firstNames = new ArrayList<>();
    private List<String> salaries = new ArrayList<>();
    private int amntOfPeople;

    public DataParser() {
        this.amntOfPeople = 0;
    }

    public void readInFile(File inFile) {
        //try(open input file)
        try(Scanner inputFile = new Scanner(inFile)) {
            //while(there is data)
            while(inputFile.hasNextLine()) {

                String temp = inputFile.nextLine();
                //Parse data at comma
                String[] personTemp= temp.split(",");

                //read string into lastNames
                lastNames.add(personTemp[0]);

                //read string into firstNames
                firstNames.add(personTemp[1]);

                //read number into salaries
                salaries.add(personTemp[2]);

                this.amntOfPeople++;
            }
        }
        //catch(IOException || NoSuchElementException || IllegalStateException e)
        catch(IOException | NoSuchElementException | IllegalStateException e) {
            //printStackTrace
            e.printStackTrace();
        }
    }

    public List<String> getLastNames() {
        return lastNames;
    }

    public List<String> getFirstNames() {
        return firstNames;
    }

    public List<String> getSalaries() {
        return salaries;
    }

    public void outputFormattedData(File outFile) {
        String outputSpecifiers = "%-10s%-10s%-8s%n";

        //try(open output file)
        try(Formatter outputFormat = new Formatter(outFile)) {
            //print "Last      First     Salary" (console and output file)
            outputFormat.format(outputSpecifiers, "Last", "First", "Salary");
            System.out.printf(outputSpecifiers, "Last", "First", "Salary");

            //print "--------------------------"
            outputFormat.format("--------------------------%n");
            System.out.println("--------------------------");

            //for(amount of people)
            for(int i = 0; i < this.amntOfPeople; i++) {
                //print lastNames[i]
                //print firstNames[i]
                //print salaries[i]
                outputFormat.format(outputSpecifiers, this.lastNames.get(i), this.firstNames.get(i), this.salaries.get(i));
                System.out.printf(outputSpecifiers, this.lastNames.get(i), this.firstNames.get(i), this.salaries.get(i));
            }
        }
        //catch(SecurityException || FileNotFoundException || FormatterClosedException e)
        catch(SecurityException | FileNotFoundException | FormatterClosedException e) {
            //printStackTrace
            e.printStackTrace();
        }
    }
}

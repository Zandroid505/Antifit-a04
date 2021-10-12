/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class NameSorter {
    private File file = new File("data/exercise41_input.txt");
    private int numPeople;
    private List<String> people = new ArrayList<>();

    public NameSorter() {
        this.numPeople = 0;
    }

    public void readFile(){
        //try(open input file)
        try(Scanner inputFile = new Scanner(file)) {
            //while(there are names to read in file)
            while(inputFile.hasNextLine()) {
                //Read Last name and first name into ArrayList
                people.add(inputFile.nextLine());

                //numPeople++
                this.numPeople++;
            }
        }
        //catch(IOException || NoSuchElementException || IllegalStateException e)
        catch(IOException | NoSuchElementException | IllegalStateException e) {
            //printStackTrace;
            e.printStackTrace();
        }
    }

    public List<String> getPeople() {
        return people;
    }

    public void sortNames(List<String> people) {
        //sort(people)
        Collections.sort(people);
    }

    public void outputSortedNames(List<String> people) {
        //try(open output file)
        try(Formatter outputFile = new Formatter("data/exercise41_output.txt")) {
            //print "Total of 'numPeople' names"
            outputFile.format("Total of %d names%n", this.numPeople);
            //print "-----------------"
            outputFile.format("-----------------%n");

            //for(people)
            for(String p : people) {
                //print "'people'"
                outputFile.format("%s%n", p);
            }
        }
        //catch(SecurityException || FileNotFoundException || FormatterClosedException e)
        catch(SecurityException | FileNotFoundException | FormatterClosedException e) {
            //printStackTrace();
            e.printStackTrace();
        }
    }
}

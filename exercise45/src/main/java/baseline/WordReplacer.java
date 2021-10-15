/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordReplacer {
    private StringBuilder originalText = new StringBuilder();

    public void readInputFile(String inFilePath) {
        //Create File object using inFile for path
        File inFile = new File(inFilePath);

        //try(open input file)
        try(Scanner inputFile = new Scanner(inFile)) {
            //while(there is text to read in file)
            while(inputFile.hasNextLine()) {
                //Append lines to originalText
                this.originalText.append(inputFile.nextLine());
                this.originalText.append("\n");
            }
        }
        //catch(IOException || NoSuchElementException || IllegalStateException e)
        catch(IOException | NoSuchElementException | IllegalStateException e){
            //printStackTrace
            e.printStackTrace();
        }
    }

    public StringBuilder getOriginalText() {
        return this.originalText;
    }

    public String replaceWord() {
        //editedString = originalText
        String editedString = this.originalText.toString();

        //Replace all occurrences of the word 'utilize' in editedString
        editedString = editedString.replace("utilize", "use");

        //return editedString
        return editedString;
    }

    public void outputFile(String editedString, String outFilePath) {
        //try(open output file)
        try(Formatter outputFile = new Formatter(outFilePath)) {
            //add editedString to outputFile
            outputFile.format(editedString);
        }
        //catch(SecurityException || FileNotFoundException || FormatterClosedException e)
        catch(SecurityException | FileNotFoundException | FormatterClosedException e){
            //printStackTrace();
            e.printStackTrace();
        }
    }
}

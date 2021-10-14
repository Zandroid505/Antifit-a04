/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.io.File;

public class WordReplacer {
    private StringBuilder originalText = new StringBuilder();

    public void readInputFile(String inFile) {
        //Create File object using inFile for path

        //try(open input file)
            //while(there is text to read in file)
                //Append lines to originalText
        //catch(IOException || NoSuchElementException || IllegalStateException e)
            //printStackTrace
    }

    public StringBuilder getOriginalText() {
        return originalText;
    }

    public String replaceWord() {
        //editedString = originalText

        //Replace all occurrences of the word 'utilize' in editedString
        //return editedString
    }

    public void outputFile(String editedString, String outFilePath) {
        //try(open output file)
            //add editedString to outputFile
        //catch(SecurityException || FileNotFoundException || FormatterClosedException e)
            //printStackTrace();
    }
}

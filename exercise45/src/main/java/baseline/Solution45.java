/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.Scanner;

public class Solution45 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Create WordReplacer object
        WordReplacer englishTeacher = new WordReplacer();

        //ask for file (including path)
        System.out.println("Type in the path of your file: ");
        //Scan input into inFilePath
        String inFilePath = input.nextLine();

        //Call readInputFile(inFilePath)
        englishTeacher.readInputFile(inFilePath);
        //editedString = Call replaceWord()
        String editedString = englishTeacher.replaceWord();

        //Call outputFile(editedString, outFilePath)
        englishTeacher.outputFile(editedString, "data/exercise45_output.txt");
    }
}

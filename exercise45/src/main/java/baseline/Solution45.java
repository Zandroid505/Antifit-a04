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

        //Call readInputFile(inFilePath)
        englishTeacher.readInputFile("data/exercise45_input.txt");
        //editedString = Call replaceWord()
        String editedString = englishTeacher.replaceWord();

        //ask for file (including path)
        System.out.println("Type in the path of your output file: ");
        //Scan input into inFilePath
        String outFilePath = input.nextLine();

        //Call outputFile(editedString, outFilePath)
        englishTeacher.outputFile(editedString, outFilePath);
    }
}

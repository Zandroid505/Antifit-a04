/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WordReplacerTest {
    WordReplacer litTeacher = new WordReplacer();

    @Test
    void checkIfFileIsReadInCorrectly() {
        StringBuilder expected = new StringBuilder();

        expected.append("I will utilize this text file for testing.\n" +
                "Junit will utilize this text file.");

        litTeacher.readInputFile("data/testInFile.txt");

        assertEquals(expected, litTeacher.getOriginalText());
    }

    @Test
    void checkIfWordsAreReplacedProperly() {
        String expected = "I will use this text file for testing.\n" +
                "Junit will use this text file.";

        litTeacher.readInputFile("data/testInFile.txt");

        assertEquals(expected, litTeacher.replaceWord());
    }

    @Test
    void CheckIfFileIsOutputtedCorrectly() {
        StringBuilder actual = new StringBuilder();
        StringBuilder expected = new StringBuilder();

        File expectedFile = new File("data/testOutExpected.txt");
        String editedString = "I will use this text file for testing.\n" +
                "Junit will use this text file.";

        litTeacher.readInputFile("data/testInFile.txt");

        litTeacher.outputFile(editedString, "data/testOutActual.txt");
        File actualFile = new File("data/testOutActual.txt");

        try(Scanner inputFile = new Scanner(expectedFile)) {
            while(inputFile.hasNextLine())
                expected.append(inputFile.nextLine());
        }
        catch(IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }

        try(Scanner outputFile = new Scanner(actualFile)) {
            while(outputFile.hasNextLine())
                actual.append(outputFile.nextLine());
        }
        catch(IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }

        assertEquals(expected, actual);

    }
}
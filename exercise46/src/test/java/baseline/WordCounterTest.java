/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void checkIfFileIsReadInProperly() {
        WordCounter fileCheck = new WordCounter();
        Map<String, Integer> expected = new TreeMap<>();
        Map<String, Integer> actual;

        expected.put("mad", 4);
        expected.put("happy", 3);
        expected.put("sad", 8);

        fileCheck.readInFile("data/testInFile.txt");
        actual = fileCheck.sortMap();

        assertEquals(expected, actual);

    }

    @Test
    void checkIfFileIsOutputtedInCorrectOrder() {
        WordCounter fileCheck = new WordCounter();
        Map<String, Integer> mapOfWords;
        StringBuilder expected = new StringBuilder();
        StringBuilder actual = new StringBuilder();

        fileCheck.readInFile("data/testInFile.txt");
        mapOfWords = fileCheck.sortMap();
        fileCheck.outputWordFrequency(mapOfWords, "data/actualTestOut.txt");

        File expectedFile = new File("data/expectedTestOutFile.txt");
        File actualFile = new File("data/actualTestOut.txt");

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

        assertEquals(expected.toString(), actual.toString());
    }
}
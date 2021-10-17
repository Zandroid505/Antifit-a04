/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DataParserTest {
    File testFile = new File("data/testInFile.txt");

    @Test
    void checkIfReadInFileMethodCorrectlyParsesDataForLastNames() {
        DataParser dataChecker = new DataParser();
        List<String> expectedLNames = new ArrayList<>();

        expectedLNames.add("Thompson");
        expectedLNames.add("Sawyer");
        expectedLNames.add("Doe");

        dataChecker.readInFile(testFile);

        assertEquals(expectedLNames, dataChecker.getLastNames());
    }

    @Test
    void checkIfReadInFileMethodCorrectlyParsesDataForFirstNames() {
        DataParser dataChecker = new DataParser();

        List<String> expectedFNames = new ArrayList<>();


        expectedFNames.add("Jeffrey");
        expectedFNames.add("Rob");
        expectedFNames.add("John");

        dataChecker.readInFile(testFile);

        assertEquals(expectedFNames, dataChecker.getFirstNames());
    }

    @Test
    void checkIfReadInFileMethodCorrectlyParsesDataForSalaries() {
        DataParser dataChecker = new DataParser();

        List<String> expectedSalaries = new ArrayList<>();

        expectedSalaries.add("78000");
        expectedSalaries.add("66000");
        expectedSalaries.add("99000");

        dataChecker.readInFile(testFile);

        assertEquals(expectedSalaries, dataChecker.getSalaries());
    }

    @Test
    void checkIfFileIsOutputtedCorrectly() {
        DataParser dataChecker = new DataParser();

        StringBuilder actual = new StringBuilder();
        StringBuilder expected = new StringBuilder();

        File expectedOutFile = new File("data/testOutExpected.txt");
        File actualOutFile = new File("data/testOutActual.txt");

        dataChecker.readInFile(testFile);
        dataChecker.outputFormattedData(actualOutFile);

        try(Scanner inputFile = new Scanner(expectedOutFile)) {
            while(inputFile.hasNextLine())
                expected.append(inputFile.nextLine());
        }
        catch(IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }

        try(Scanner outputFile = new Scanner(actualOutFile)) {
            while(outputFile.hasNextLine())
                actual.append(outputFile.nextLine());
        }
        catch(IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }

        assertEquals(expected.toString(), actual.toString());

    }
}
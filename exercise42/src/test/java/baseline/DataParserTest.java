/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataParserTest {
    File testFile = new File("data/testInputFile.txt");

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
}
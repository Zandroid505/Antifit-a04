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

class NameSorterTest {
    @Test
    void checkIfFileIsReadInCorrectly() {
        NameSorter fileCheck = new NameSorter();
        List<String> expected = new ArrayList<>();

        expected.add("Squarepants, Spongebob");
        expected.add("Cheeks, Sandy");
        expected.add("Tentacles, Squidward");
        expected.add("Star, Patrick");

        fileCheck.readFile("data/testInFile.txt");

        assertEquals(expected, fileCheck.getPeople());
    }

    @Test
    void checkIfNamesAreSortedCorrectlyForBinkinBottom() {
        NameSorter bikniBottom  = new NameSorter();
        List<String> actual = new ArrayList<>();
        List<String> expected = new ArrayList<>();

        actual.add("Squarepants, Spongebob");
        actual.add("Star, Patrick");
        actual.add("Tentacles, Squidward");
        actual.add("Cheeks, Sandy");

        bikniBottom.sortNames(actual);

        expected.add("Cheeks, Sandy");
        expected.add("Squarepants, Spongebob");
        expected.add("Star, Patrick");
        expected.add("Tentacles, Squidward");

        assertEquals(expected, actual);
    }

    @Test
    void checkIfNamesAreSortedCorrectlyForAvengers() {
        NameSorter avengers  = new NameSorter();
        List<String> actual = new ArrayList<>();
        List<String> expected = new ArrayList<>();

        actual.add("Stark, Tony");
        actual.add("Banner, Bruce");
        actual.add("Rogers, Steve");
        actual.add("Odinson, Thor");

        avengers.sortNames(actual);

        expected.add("Banner, Bruce");
        expected.add("Odinson, Thor");
        expected.add("Rogers, Steve");
        expected.add("Stark, Tony");

        assertEquals(expected, actual);
    }

    @Test
    void checkIfFileIsOutputtedCorrectly() {
        NameSorter fileCheck = new NameSorter();
        StringBuilder actual = new StringBuilder();
        StringBuilder expected = new StringBuilder();
        List<String> testPeople = new ArrayList<>();

        File expectedFile = new File("data/testOutExpected.txt");

        testPeople.add("Cheeks, Sandy");
        testPeople.add("Squarepants, Spongebob");
        testPeople.add("Star, Patrick");
        testPeople.add("Tentacles, Squidward");

        fileCheck.readFile("data/testInFile.txt");

        fileCheck.outputSortedNames(testPeople, "data/testOutActual.txt");
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

        assertEquals(expected.toString(), actual.toString());

    }
}
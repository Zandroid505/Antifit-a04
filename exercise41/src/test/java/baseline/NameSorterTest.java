/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

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
}
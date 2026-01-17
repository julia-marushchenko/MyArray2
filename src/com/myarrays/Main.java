/**
 *  Java program to use Arrays.deepToString() to show clean and readable representation of data.
 */
package com.myarrays;

import java.util.Arrays;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating an array with strings.
        String [] words = new String[] {"House", "Tree", "Parking"};

        // Printing the array words to console.
        System.out.println(Arrays.deepToString(words));

    }

}
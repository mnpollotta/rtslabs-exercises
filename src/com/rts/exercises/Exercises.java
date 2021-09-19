/**
 * For: RTS Labs
 * Using: Oracle OpenJDK 8
 * Author: Matthew Pollotta
 */

package com.rts.exercises;

public class Exercises {
    public static void main(String[] args) {

        /**
         * Exercise 1
         * Print the number of integers in an array that are above the given input and the number that are below.
         */
        int needle = 6;
        int[] haystack = {1, 5, 2, 1, 10};
        System.out.println(getAboveBelow(needle, haystack));

        /**
         * Exercise 2
         * Rotate the characters in a string by a given input and have the overflow appear at the beginning.
         */
        int positions = 2;
        String toSpin = "MyString";
        System.out.println(spinString(positions, toSpin));

        /**
         * Exercise 3
         * If you could change 1 thing about your favorite framework/language/platform (pick one), what would it be?
         *
         * PHP doesn't currently support the traditional sense of method overloading unless you provide the additional
         * arguments as optional. I've been part of the campaign to have it added to PHP 8 but to no avail.
         */
    }

    /**
     * Get the number of listed integers in a supplied array that are above and below the supplied needle.
     * @param needle The int to compare to
     * @param haystack The array of ints to search through
     * @return The formatted string response
     */
    private static String getAboveBelow(int needle, int[] haystack) {
        final String r = "above: %s,below: %s"; //The return string
        int above = 0; //Count of numbers above needle
        int below = 0; // Count of numbers below needle

        for (int i = 0; i < haystack.length; i++) {
            if (needle < haystack[i]) {
                above++;
            }
            else if (needle > haystack[i]) {
                below++;
            }
        }

        return String.format(r, above, below);
    }

    /**
     * Removes the number of positions provided from end of string and places them at the start of the string.
     * @param positions The number of characters to reposition.
     * @param data The string to reposition the characters.
     * @return The modified string.
     */
    private static String spinString(int positions, String data) {
        String r = "";

        if (positions <= data.length()) {
            String trimmed = data.substring(0, data.length() - positions);
            String trim = data.substring(data.length() - positions);
            r = trim + trimmed;
        }
        else {
            r = "Positions cannot be greater than length of string.";
        }

        return r;
    }
}

// Write a Java program that counts the number of palindrome words in a given sentence.
// A palindrome word is one that reads the same forwards and backwards,ignoring case and non-alphabetic characters.
// Your task is to implement a function that takes a string as input and returns the total count of palindrome words in that string.

// Input:
// A single string sentence containing words separated by spaces and/or punctuation.

// Output:
// An integer representing the number of palindrome words in the given sentence.

// Example:

// Example 1:

// Input:"Madam Arora teaches malayalam and her students read noon and level."
// Output:5

// Explanation:The palindrome words are: "madam", "arora", "malayalam", "noon", and "level".

// Example 2:

// Input:"A man a plan a canal Panama"
// Output:0

// Explanation: Although the phrase itself is a palindrome, none of the individual words ("a", "man", "plan", "canal", "Panama") are palindromes.

import java.util.Scanner;

public class p49_String_Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] toFunc = input.split(" ");
        int count = 0;
        for (String s : toFunc) {
            if (checkPalin(s) == true)
                count++;
        }

        System.out.println(count);
        sc.close();
    }

    private static boolean checkPalin(String s) {
        int st = 0;
        int end = s.length() - 1;
        while (st < end) {
            if (s.charAt(st) == s.charAt(end)) {
                st++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}

// Problem Statement: Swap the First and Last Characters of Each Word in a String

// Description: Write a Java program that takes a string as input and swaps the first and last 
// characters of each word in the string.Words are separated by spaces,and the string may contain punctuation marks.
// The program should handle edge cases,such as single-character words,empty words,and words with only two characters.

// Input:
// A string inputStr that contains words separated by spaces.It may contain punctuation marks.

// Output:
// A string with the first and last characters of each word swapped.

import java.util.Scanner;
// import java.util.StringTokenizer;

public class p48_String_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = swapEle(input);
        System.out.println(output);
        sc.close();
    }

    private static String swapEle(String input) {
        String[] words = input.split(" ");
        StringBuilder swapped = new StringBuilder();
        for (String word : words) {
            if (word.length() > 1) {
                swapped.append(word.charAt(word.length() - 1))
                        .append(word.substring(1, word.length() - 1))
                        .append(word.charAt(0))
                        .append(" ");
            } else {
                swapped.append(word)
                        .append(" ");
            }
        }
        return swapped.toString().trim();
    }
}

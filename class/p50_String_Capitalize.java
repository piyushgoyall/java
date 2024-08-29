// Problem Statement: Capitalize the First Letter of Each Word in a String

// Description:Write a Java program that takes a string input and capitalizes the first letter of each word while 
// converting the remaining letters of each word to lowercase.Words are considered to be sequences of characters separated by spaces.
// The program should handle cases where words are separated by multiple spaces.

// Input:
// A string input read from the user input.It may contain multiple words separated by spaces.

// Output:
// A string where the first letter of each word is capitalized and the rest of the letters are in lowercase.Words should be separated by a single space.

import java.util.Scanner;

public class p50_String_Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String ans = Capitalze(st.toLowerCase());
        System.out.println(ans);
        sc.close();
    }

    private static String Capitalze(String lowerCase) {
        String[] spl = lowerCase.split("[\\s]+");
        StringBuilder rtrn = new StringBuilder();
        for (String word : spl) {
            if (word.length() > 1) {
                rtrn = rtrn.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            } else {
                rtrn = rtrn.append(Character.toUpperCase(word.charAt(0)))
                        .append(" ");
            }
        }
        return rtrn.toString().trim();
    } 

}

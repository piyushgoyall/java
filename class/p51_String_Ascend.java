// Problem Statement: Check Ascending Sequence of Numbers in a String

// Description: Write a Java program that extracts numerical sequences embedded within a string and 
// checks whether these numbers are in ascending order. The string contains words mixed with numbers, 
// and your task is to identify the numbers and verify if they follow an ascending sequence. 
// Non-numerical characters should be ignored, and only valid numerical sequences should be considered.

// Input:
// A string input that contains words interspersed with numerical sequences. The string may contain digits anywhere within the words.

// Output:
// A boolean value true if the numbers extracted from the string are in ascending order, otherwise false. 
// The program should print “Series is in ascending order” if the sequence is valid and “Not in order” otherwise.

// import java.util.Arrays;
import java.util.Scanner;

public class p51_String_Ascend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        boolean ans = checkAscend(st);
        System.out.println(ans);
        sc.close();
    }

    private static boolean checkAscend(String st) {
        String[] temp = st.split("[^1-9]+");
        for (int i = 1; i < temp.length; i++) {
            if (temp[i].length() == 0 || temp[i - 1].length() == 0) {
                continue;
            }
            if (Integer.valueOf(temp[i]) < Integer.valueOf(temp[i - 1])) {
                return false;
            }
        }
        return true;

    }
}

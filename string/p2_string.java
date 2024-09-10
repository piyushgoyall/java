// check if string is palindrome

import java.util.Scanner;

public class p2_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        boolean res = isPalindrome(word);
        System.out.println(res);
        sc.close();
    }

    public static boolean isPalindrome(String input) {
        int st = 0;
        int en = input.length() - 1;
        while (st < en) {
            if (input.charAt(st) != input.charAt(en)) {
                return false;
            }
            st++;
            en--;
        }
        return true;
    }
}

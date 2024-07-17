// Reverse string

import java.util.Scanner;

public class string_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String rev = reverse(word);
        System.out.println(rev);
        sc.close();
    }

    public static String reverse(String input)
    {
        StringBuilder rev = new StringBuilder(input); // Can be done with StringBuffer
        int st = 0;
        int en = input.length() - 1;
        while (st < en)
        {
            char temp = rev.charAt(st); // Swap characters at positions st and en
            rev.setCharAt(st, rev.charAt(en));
            rev.setCharAt(en, temp);
            st++;
            en--;
        }
        return rev.toString();
    }
}

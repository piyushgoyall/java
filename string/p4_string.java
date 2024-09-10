// Count vowels

import java.util.Scanner;

public class p4_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = vowelCount(word);
        System.out.println(count);
        sc.close();
    }

    public static int vowelCount(String input) {
        int count = 0;
        String vow = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vow.indexOf(c) != -1) // Alternate: instead of -1 write >= 0
                count++;
        }
        return count;
    }
}

// import java.util.Scanner;

// public class string_4 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String word = sc.nextLine();
// int count = vowelCount(word);
// System.out.println(count);
// sc.close();
// }

// public static int vowelCount(String input) {
// int count = 0;
// String vowel = "aeiouAEIOU";
// for (int i = 0; i < input.length(); i++) {
// if (vowel.indexOf(input.charAt(i)) != -1)
// count++;
// }
// return count;
// }
// }

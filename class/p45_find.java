// In an unsorted array, one element(A) is missing and one element(B) is occurring twice. Find A and B.

// eg:
// 5 
// 1 2 4 2 5 
// ANSWER->2 3

import java.util.Scanner;

public class p45_find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[arr[i] - 1]++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]);
        }

        int a = -1;
        int b = -1;
        for (int i = 0; i < n; i++) {
            if (temp[i] == 0)
                a = i + 1;

            if (temp[i] > 1)
                b = i + 1;
        }

        System.out.print(b + " " + a);
        sc.close();

    }
}
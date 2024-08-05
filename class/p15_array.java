// Given a sorted array with duplicate elements. Return an array with unique elements (Do not use another array)

import java.util.Scanner;

public class p15_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = 0;
            System.out.println("Enter array size: ");
            if (sc.hasNextInt())
                n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                }
            }

            int i = 0, j = 1;
            for (; j < n; j++) {
                if (arr[j] != arr[i]) {
                    i++;
                    arr[i] = arr[j];
                }
            }

            System.out.println(i);

            for (int x = 0; x <= i; x++)
                System.out.print(arr[x] + " ");
        } finally {
            sc.close();

        }

    }
}

// Given an array [2,4,6,8,10]. Print pairs in array [2,4] [2,6] [2,8] [2,10] | [4,6] [4,8] [4,10] | [6,8] [6,10] | [8,10] 

import java.util.Scanner;

public class p22_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = 0;
            System.out.println("Enter array size: ");
            if (sc.hasNextInt()) {

                n = sc.nextInt();
            }

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                }
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    System.out.print("[ " + arr[i] + ", " + arr[j] + " ] ");
                }
                System.out.println("\n");
            }

        } finally {
            sc.close();
        }
    }
}

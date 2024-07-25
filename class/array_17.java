// Given an integer array nums, find the contiguous subarray(containing at least one number) 
// which has the largest sum and return its sum.Implement this using Kadane's Algorithm.

import java.util.Scanner;

public class array_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = 0;
            System.out.println("Enter array size: ");
            if (sc.hasNextInt()) {

                n = sc.nextInt();
            }

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt())
                    arr[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 1; i < n; i++) {
                sum = arr[i] + arr[i - 1];
                if (sum >= 0)
                    arr[i] = sum;
                else
                    arr[i] = 0;
            }

            int maxx = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > maxx)
                    maxx = arr[i];
            }

            System.out.println(maxx);

        } finally {
            sc.close();
        }
    }
}
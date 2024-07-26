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
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                sum = arr[i] + sum;
                max = Math.max(max, sum);

                if (sum < 0)
                    sum = 0;
            }

            System.out.println(max);

        } finally {
            sc.close();
        }
    }
}
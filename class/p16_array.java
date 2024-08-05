// Boyer-Moore Majority Voting Algorithm
// Find majority element in an array. (Element should be there greater than n/2 number of time in the array.)

import java.util.Scanner;

public class p16_array {
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

            // int ele = arr[0], count = 1;
            // for (int i = 1; i < n; i++) {
            // if (count == 0)
            // ele = arr[i];
            // else if (ele == arr[i]) {
            // count++;
            // } else if (ele != arr[i])
            // count--;
            // }

            int ele = arr[0], count = 0;
            for (int i = 1; i < n; i++) {
                if (count == 0) {
                    ele = arr[i];
                    count++;
                } else if (ele == arr[i]) {
                    count++;
                } else if (ele != arr[i])
                    count--;
            }

            int temp = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == ele) {
                    temp++;
                }
            }

            if (temp > (n / 2)) {
                System.out.println("Majority element: " + ele);
            } else {
                System.out.println("No Majority Value");
            }

        } finally {
            sc.close();
        }
    }
}

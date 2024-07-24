// // Gievn an array with positive and negative integers. Take a temporaray array and arrange all odd elements brfore even in the temporary array.

import java.util.Scanner;
// import java.util.Arrays;
// import java.util.Collections;

public class array_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = 0;
        System.out.println("Enter array size: ");
        if (sc.hasNextInt())
            arrSize = sc.nextInt();

        int arr[] = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            if (sc.hasNextInt())
                arr[i] = sc.nextInt();
        }

        int i = 0, j = arrSize - 1;
        while (arr[i] % 2 != 0) {
            i++;
        }

        while (arr[j] % 2 == 0) {
            j--;
        }

        int k = i;
        int temp;
        while (k < j) {
            if (arr[k] % 2 == 0) {
                temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;

                k++;
                j--;
                while (arr[j] % 2 == 0)
                    j--;
            } else {
                temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
                i++;
                while (arr[i] % 2 != 0)
                    i++;
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}

// import java.util.Scanner;
// import java.util.Arrays;

// public class array_13 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int arrSize = 0;
// System.out.println("Enter array size: ");
// if (sc.hasNextInt())
// arrSize = sc.nextInt();

// int arr[] = new int[arrSize];
// for (int i = 0; i < arrSize; i++) {
// if (sc.hasNextInt())
// arr[i] = sc.nextInt();
// }

// int arr2[] = new int[arrSize];
// int i = 0, j = arrSize - 1;
// for (int x = 0; x < arrSize; x++) {
// if ((arr[x]) % 2 == 0) {
// arr2[j] = arr[x];
// j--;
// } else {
// arr2[i] = arr[x];
// i++;
// }
// }
// Arrays.sort(arr2, 0, i);
// Arrays.sort(arr2, i, arrSize);
// for (int x = 0; x < arrSize; x++) {
// System.out.print(arr2[x] + " ");
// }

// sc.close();
// }
// }

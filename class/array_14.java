// // Rotate array by d positions without using reverse function

import java.util.Scanner;

public class array_14 {
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

        int d = sc.nextInt();

        reverse(arr, 0, d - 1);
        reverse(arr, d, arrSize - 1);
        reverse(arr, 0, arrSize - 1);

        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

// // import java.util.Scanner;

// // public class array14 {
// // public static void main(String[] args) {
// // Scanner sc = new Scanner(System.in);
// // int arrSize = 0;
// // System.out.println("Enter array size: ");
// // if (sc.hasNextInt())
// // arrSize = sc.nextInt();

// // int arr[] = new int[arrSize];
// // for (int i = 0; i < arrSize; i++) {
// // if (sc.hasNextInt())
// // arr[i] = sc.nextInt();
// // }

// // int d = sc.nextInt();

// // int temp[] = new int[d];
// // for (int i = 0; i < d; i++) {
// // temp[i] = arr[i];
// // }

// // for (int i = d; i < arrSize; i++) {
// // arr[i - d] = arr[i];
// // }

// // for (int i = 0; i < d; i++) {
// // arr[arrSize - d + i] = temp[i];
// // }
// // for (int i = 0; i < arrSize; i++) {
// // System.out.print(arr[i] + " ");
// // }
// // sc.close();
// // }
// // }

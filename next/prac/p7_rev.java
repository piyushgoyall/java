package prac;
import java.util.Scanner;

public class p7_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    static void reverse(int[] arr, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

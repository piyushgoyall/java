package prac;
import java.util.Scanner;

public class p6_Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// public class p6_Jagged {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int[][] arr = new int[n][];
// for (int i = 0; i < n; i++) {
// int m = sc.nextInt();
// arr[i] = new int[m];
// for (int j = 0; j < m; j++) {
// arr[i][j] = sc.nextInt();
// }
// }

// System.out.println("\nArray: ");

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }

// sc.close();
// }
// }

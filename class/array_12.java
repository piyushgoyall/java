import java.util.Arrays;
import java.util.Scanner;

public class array_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are:");
        System.out.println(Arrays.toString(arr1));

        sc.close();
    }
}

// import java.util.Scanner;

// public class array_12 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr1 = new int[n];
// for (int i = 0; i < arr1.length; i++) {
// arr1[i] = sc.nextInt();
// }
// for (int i = 0; i < arr1.length; i++) {
// System.out.print(arr1[i] + " ");
// }
// sc.close();
// }
// }

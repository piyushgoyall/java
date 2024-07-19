// Given an array containing n distinct numbers taken from the range 0 to n (inclusive), find the one number that is missing from the array using bit manipulation. 

import java.util.Scanner;

public class find_missing_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = 0;
        System.out.println("Enter array size: ");
        if (sc.hasNextInt())
            arrSize = sc.nextInt();

        int arr[] = new int[arrSize];
        for (int i = 0; i < arrSize; i++)
        {
            if (sc.hasNextInt())
                arr[i] = sc.nextInt();
        }
        
        int a = 0, b = 0;
        for (int i = 0; i < arrSize; i++)
        {
            a = a ^ arr[i];
        }
        for (int i = 1; i <= arrSize+1; i++)
        {
            b = b ^ i;
        }
        System.out.println(b^a);
        sc.close();
    }
}

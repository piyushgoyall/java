import java.util.Scanner;

public class p10_Array_Unique {
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

        int xored = 0;
        for (int i = 0; i < arrSize; i++)
            xored = xored ^ arr[i];

        System.out.println(xored);
        sc.close();
    }

}

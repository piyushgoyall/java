package prac;
import java.util.Scanner;

public class p10_Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(arr[floor(arr, target)]);
        sc.close();
    }

    static int floor(int[] arr, int target) {
        int st = 0;
        int en = arr.length - 1;

        while (st <= en) {
            int mid = st + (en - st) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                en = mid - 1;
            else
                st = mid + 1;
        }

        return en;
    }
}

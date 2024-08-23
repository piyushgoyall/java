import java.util.Scanner;

public class p8_OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        if (arr[0] < arr[n - 1])
            System.out.println(OabsInc(arr, target));
        else
            System.out.println(OabsDec(arr, target));
        sc.close();
    }

    static int OabsInc(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target)
                return mid;

            else if (arr[mid] > target)
                end = mid - 1;

            else
                st = mid + 1;
        }

        return -1;
    }

    static int OabsDec(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target)
                return mid;

            else if (arr[mid] < target)
                end = mid - 1;

            else
                st = mid + 1;
        }

        return -1;
    }
}
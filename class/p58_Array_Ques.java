import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class p58_Array_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pro = 1;
        for (int i = 0; i < n; i++)
            pro *= arr[i];

        for (int i = 0; i < n - 1; i++)
            arr[i] = pro / arr[i + 1];

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}

// public class p58_Array_Ques {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// List<Integer> ans = new ArrayList<>();

// if (n < 2) {
// System.out.println(Arrays.toString(arr));
// } else {
// for (int i = 0; i < n - 1; i++) {
// ans.add(calPro(arr, n, i));
// }
// ans.add(arr[n-1]);
// System.out.println(ans);
// }
// sc.close();
// }

// static int calPro(int[] arr, int n, int index) {
// int pro = 1;
// for (int i = 0; i < n; i++) {
// if (i != index + 1)
// pro *= arr[i];
// }
// return pro;
// }
// }

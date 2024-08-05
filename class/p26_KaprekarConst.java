import java.util.Arrays;
import java.util.Scanner;

public class p26_KaprekarConst {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        while (n != 6174) {
            n = kap(n);
            System.out.println(n);
        }
    }

    private static int kap(int n) {
        String numStr = String.format("%04d", n);
        String decStr = sortStr(numStr, false);
        String incStr = sortStr(numStr, true);

        int decNum = Integer.parseInt(decStr);
        int incNum = Integer.parseInt(incStr);

        return decNum - incNum;
    }

    static String sortStr(String numStr, boolean asc) {
        char[] arr = numStr.toCharArray();
        Arrays.sort(arr);
        if (!asc) {
            reverseArr(arr);
        }
        return new String(arr);
    }

    private static void reverseArr(char[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}

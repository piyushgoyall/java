// Print n'th fibonacci

import java.util.Scanner;

public class rec_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printNthFibo(n));
        sc.close();
    }

    public static int printNthFibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return printNthFibo(n - 1) + printNthFibo(n - 2);
    }
}
import java.util.Scanner;

public class p3_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a > b ? a : b;
        int d = a > b ? b : a;

        System.out.println(calGCD(c, d));
    }

    static int calGCD(int a, int b) {
        if (b == 0)
            return a;
        return calGCD(b, a % b);
    }
}

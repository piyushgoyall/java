import java.util.Scanner;

public class p2_PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        calC(x);
    }

    private static void calC(int n) {
        for (int i = 2; i * i < n; i++) {
            while (n % i == 0) {
                n /= i;
                System.out.println(i);
            }
        }

        if (n > 1) {
            System.out.println(n);
        }
    }
}

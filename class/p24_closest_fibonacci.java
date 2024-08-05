import java.util.Scanner;

public class p24_closest_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nextFib(n);
        sc.close();
    }

    public static void nextFib(int n) {
        int a = 0, b = 1;
        while (b < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        if ((n - a) < (b - n))
            System.out.println(a);

        else
            System.out.println(b);
    }
}

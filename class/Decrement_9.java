import java.util.Scanner;

public class Decrement_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while ((n & x) == 0) {
            n = n ^ x;
            x = x << 1;
        }
        n = n ^ x;
        System.out.println(n);

        sc.close();
    }
}

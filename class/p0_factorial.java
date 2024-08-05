import java.util.Scanner;

public class p0_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int res = fact(n);
            System.out.println(res);
        } finally {
            sc.close();

        }

    }

    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}

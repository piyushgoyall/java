import java.util.Scanner;

public class p44_Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n, false));
        sc.close();
    }

    private static int solve(int n, boolean TwoSteps) {
        if (n < 0)
            return 0;

        if (n == 0)
            return 1;

        int res = solve(n - 1, false);

        if (!TwoSteps)
            res += solve(n - 2, true);

        return res;
    }
}

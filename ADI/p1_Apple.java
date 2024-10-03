import java.util.Scanner;

public class p1_Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int distribute = sc.nextInt();

        int ans = (distribute + (pos - 1)) % n;
        if (ans == 0)
            System.out.println(n);
        else
            System.out.println(ans);
    }
}

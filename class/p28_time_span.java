import java.util.Scanner;

public class p28_time_span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = String.format("%02d" + " : " + "%02d" + " : " + "%02d", (n / 3600), ((n % 3600) / 60), n % 60);
        System.out.println(ans);
        sc.close();
    }
}

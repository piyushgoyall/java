import java.util.Scanner;

public class kaprekar_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        kaprekar(n);
        sc.close();
    }

    public static void kaprekar(int n) {
        int sq = n;
        for (int i = 1; i < 2; i++) {
            sq = sq * sq;
        }
        // sq = (int)sq;
        System.out.println(sq);
        int count = 0;
        int temp = n;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int tempCount = count;
        int t = 10;
        while (tempCount > 1) {
            t = t * 10;
            tempCount--;
        }

        // System.out.println(t);

        int num = 0;
        num = sq % t;
        sq = sq / t;
        System.out.println(num);

        if ((num + sq) == n) {
            System.out.println("Kaprekar num: " + num + " " + sq);
        } else {
            System.out.println("Not Kaprekar");
        }

    }
}

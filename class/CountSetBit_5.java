import java.util.Scanner;

public class CountSetBit_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            count = count + (num & 1);
            num = num >> 1;
        }
        System.out.println(count);
        sc.close();
    }
}
// Ques 14. Plus one, Take any 4 digit number (between 1000 and 9999, including both). 
// Add 1 to all digits and return the resulting 4 digit number. If resulting digit crosses 10 then take modulus 10.

// eg: 2893 + 1111 = 3904.

import java.util.Scanner;

public class p46_add_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = 0;
        int count = 0;

        while (n != 0) {
            double mul = Math.pow(10, count);
            int toAdd = ((n % 10) + 1) % 10;
            x = toAdd * (int) mul + x;
            n = n / 10;
            count++;
        }

        System.out.printf("%04d%n", x);
        sc.close();
    }
}

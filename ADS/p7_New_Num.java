// Write a function evenDigits that takes an integer n and returns a new number made of only the even digits from n, 
// keeping the same order. If there are no even digits, return 0.

import java.util.*;

class p7_New_Num {
    public static int evenDigits(int n) {
        int newNum = 0;
        int factor = 1;
        boolean hasEven = false;

        n = Math.abs(n);

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                newNum = (digit * factor) + newNum;
                factor *= 10;
                hasEven = true;
            }
            n /= 10;
        }

        return hasEven ? newNum : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(evenDigits(n));
    }
}
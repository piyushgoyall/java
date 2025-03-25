// Given a number n, print all primes smaller than or equal to n.

import java.util.*;

public class p6_Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Boolean> prime = new ArrayList<>(Collections.nCopies(n + 1, true));

        for (int i = 2; i * i <= n; i++) {
            if (prime.get(i).equals(true)) {
                for (int j = i * i; j <= n; j += i) {
                    prime.set(j, false);
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime.get(i).equals(true))
                System.out.println(i + " ");
        }

        sc.close();
    }
}

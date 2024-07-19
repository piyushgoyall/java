import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            boolean isPrime = true;
            if (n <= 1) {
                isPrime = false;

            }
            if (n <= 3) {
                isPrime = true;

            } else if (n % 2 == 0 || n % 3 == 0) {
                isPrime = false;
            }

            else {
                for (int i = 5; i <= Math.sqrt(n); i += 6) {
                    if (n % i == 0 || n % (i + 1) == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        } finally {
            sc.close();

        }
    }
}

// import java.util.Scanner;

// public class prime {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// boolean isPrime = true;
// if (n <= 1) {
// isPrime = false;

// } else if (n <= 3) {
// isPrime = true;

// }

// else {
// for (int i = 2; i < Math.sqrt(n); i++) {
// if (n % i == 0) {
// isPrime = false;
// break;
// }
// }
// }
// if (isPrime) {
// System.out.println("Prime");
// } else {
// System.out.println("Not Prime");
// }

// }
// }

import java.util.Scanner;

public class p42_Exception_Han {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextByte();
        int b = sc.nextByte();

        System.out.println("Before Exception Code");

        try {
            int c = division(a, b);
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("After exception code");
        sc.close();

    }

    private static int division(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

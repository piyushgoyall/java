import java.util.Scanner;

public class p0_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a year: \n");
            int n = sc.nextInt();
            if (n % 4 == 0) {
                if (n % 100 != 0 || n % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Not a leap year");
            }
        } finally {
            // Close the Scanner to avoid resource leak
            sc.close();
        }
    }
}

import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class p53_Validate_Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        try {
            validateemail(email);
            System.out.println("Valid email");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    private static void validateemail(String email) throws InvalidEmailException {
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        if (atpos > 0 && dotpos > atpos + 1 && dotpos < email.length() - 1) {
            System.out.println("It is valid email");
        } else {
            throw new InvalidEmailException("Error");
        }
    }
}
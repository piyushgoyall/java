import java.util.Scanner;

class ShortPasswordException extends Exception {
    public ShortPasswordException(String message) {
        super(message);
    }
}

public class p52_ValidatePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        try {
            validatePasswprd(password);
            System.out.println("Valid Password");
        } catch (ShortPasswordException e) {
            System.out.println("Invali password " + e.getMessage());
        }
        sc.close();
    }

    private static void validatePasswprd(String password) throws ShortPasswordException {
        int minLength = 8;
        if (password.length() < minLength) {
            throw new ShortPasswordException("\nCustom Invalid Password");
        }
    }
}

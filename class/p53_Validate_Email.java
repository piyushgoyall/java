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

        if (atpos == -1 || atpos == 0 || atpos == email.length() - 1) {
            throw new InvalidEmailException("Error: Invalid '@' position.");
        }

        String local = email.substring(0, atpos);
        int localDot = local.lastIndexOf(".");

        String domain = email.substring(atpos, email.length());
        int domainDot = domain.indexOf(".");

        if (domainDot == -1 || domainDot == 0 || domainDot == domain.length() - 1) {
            throw new InvalidEmailException("Error: Invalid domain part.");
        }

        // Check if the first character is '.' or '@'
        if (email.charAt(0) == '.' || email.charAt(0) == '@') {
            throw new InvalidEmailException("Error: Email cannot start with '.' or '@'.");
        }

        // Check if the last character is '.' or '@'
        if (email.charAt(email.length() - 1) == '.' || email.charAt(email.length() - 1) == '@') {
            throw new InvalidEmailException("Error: Email cannot end with '.' or '@'.");
        }

        if ((atpos - localDot) > 0 && (domainDot - atpos) > 0) {
            System.out.println("It is valid email");
        } else {
            throw new InvalidEmailException("Error");
        }
    }
}

// public class p53_Validate_Email {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String email = sc.nextLine();
// try {
// validateemail(email);
// System.out.println("Valid email");
// } catch (InvalidEmailException e) {
// System.out.println(e.getMessage());
// }
// sc.close();
// }

// private static void validateemail(String email) throws InvalidEmailException
// {
// int atpos = email.indexOf("@");
// int dotpos = email.indexOf(".");
// if (atpos > 0 && dotpos > atpos + 1 && dotpos < email.length() - 1) {
// System.out.println("It is valid email");
// } else {
// throw new InvalidEmailException("Error");
// }
// }
// }
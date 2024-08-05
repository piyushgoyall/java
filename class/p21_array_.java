// Create a menu program with the following options:

// i. Add Element
// ii. Remove Element
// iii. Display Elements
// Iv. Exit

// This program runs infinitely until the user chooses the fourth option.

import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p21_array_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            List<String> items = new ArrayList<>();

            while (true) {
                System.out.println("Select an option:\n1. Add Element\r\n" +
                        "2. Remove Element\r\n" +
                        "3. Display Elements\r\n" +
                        "4. Exit");

                int n = sc.nextInt();
                sc.nextLine();
                if (n == 1) {
                    System.out.println("Enter element to be added: ");
                    String word = sc.nextLine();
                    items.add(word);
                } else if (n == 2) {
                    System.out.println("Enter element to be removed: ");
                    String rem = sc.nextLine();
                    if (items.contains(rem)) {
                        items.remove(rem);
                    } else {
                        System.out.println("Element not found in the list." + "\n");
                    }
                } else if (n == 3) {
                    System.out.println("Elements in the list: " + items + "\n");
                } else if (n == 4) {
                    System.out.println("Thank You!!" + "\n");
                    break;
                } else {
                    System.out.println("Invalid option. Please select a valid option." + "\n");
                }

            }

        } finally {
            sc.close();
        }
    }
}

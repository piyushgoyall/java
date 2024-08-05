// Create a list of unique elements taken from the user. 
// Sort and print these elements.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class p20_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            List<Integer> arr = new ArrayList<>();

            System.out.println("Enter integers (type 'q' to quit):");

            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    int n = sc.nextInt();
                    if (!arr.contains(n))
                        arr.add(n);

                    Collections.sort(arr);

                } else {
                    String input = sc.next();
                    if (input.equalsIgnoreCase("q")) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter an integer or 'q' to quit:");
                    }
                }
            }
            System.out.println(arr);

        } finally {
            sc.close();
        }
    }
}

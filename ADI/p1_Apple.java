// The given code solves a problem where you need to distribute items (like apples) to a group of n people sitting in a circle. 
// The task is to find the position of the person who will receive the last distributed item.
// n: Number of people sitting in a circle.
// pos: The starting position of the distribution (1-based index).
// distribute: The total number of items to distribute.

import java.util.Scanner;

public class p1_Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int distribute = sc.nextInt();

        int ans = (distribute + (pos - 1)) % n;
        if (ans == 0)
            System.out.println(n);
        else
            System.out.println(ans);
    }
}

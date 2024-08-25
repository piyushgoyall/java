// Shell-Layered_Rotate

import java.util.*;

public class p43_Shell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("Original 2D Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        List<Integer> shellElements = getShell(arr, n, m, s);
        int shellSize = shellElements.size();

        // System.out.println(shellElements);

        Collections.reverse(shellElements);
        reverseSublist(shellElements, 0, shellSize - r - 1);
        reverseSublist(shellElements, shellSize - r, shellSize - 1);

        // System.out.println(shellElements);

        setElements(arr, shellElements, n, m, s);

        System.out.println("Shell Rotated 2D Array: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void setElements(int[][] arr, List<Integer> list, int n, int m, int s) {
        int startRow = s - 1;
        int endRow = n - s;
        int startCol = s - 1;
        int endCol = m - s;
        int index = 0;

        for (int i = startCol; i <= endCol; i++) {
            arr[startRow][i] = list.get(index);
            index++;
        }
        startRow++;

        for (int i = startRow; i <= endRow; i++) {
            arr[i][endCol] = list.get(index);
            index++;
        }
        endCol--;

        for (int i = endCol; i >= startCol; i--) {
            arr[endRow][i] = list.get(index);
            index++;
        }
        endRow--;

        for (int i = endRow; i >= startRow; i--) {
            arr[i][startCol] = list.get(index);
            index++;
        }
        startCol++;

    }

    public static void reverseSublist(List<Integer> list, int start, int end) {
        while (start < end) {
            // Swap the elements at start and end indices
            Integer temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    static List<Integer> getShell(int[][] arr, int n, int m, int s) {
        ArrayList<Integer> num = new ArrayList<>();
        int startRow = s - 1;
        int endRow = n - s;
        int startCol = s - 1;
        int endCol = m - s;

        for (int i = startCol; i <= endCol; i++) {
            num.add(arr[startRow][i]);
        }
        startRow++;

        for (int i = startRow; i <= endRow; i++) {
            num.add(arr[i][endCol]);
        }
        endCol--;

        for (int i = endCol; i >= startCol; i--) {
            num.add(arr[endRow][i]);
        }
        endRow--;

        for (int i = endRow; i >= startRow; i--) {
            num.add(arr[i][startCol]);
        }
        startCol++;

        return num;
    }

    // static void rotate(int[][] arr, int s, int r) {
    // int[] oned = storeinoned(arr, s);
    // rotate(oned, s, r);
    // }
}

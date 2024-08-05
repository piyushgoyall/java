// 2D Array

import java.util.Arrays;

public class p18_array {
    public static void main(String[] args) {
        int[][] arr = getArr();
        printArr(arr);
    }

    private static int[][] getArr() {
        return new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
    }

    public static void printArr(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }
    
}

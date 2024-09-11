package prac;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> numbers = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return numbers;
        }

        int topRow = 0;
        int lastCol = matrix[0].length - 1;
        int bottomRow = matrix.length - 1;
        int startCol = 0;

        while (topRow <= bottomRow && startCol <= lastCol) {
            for (int i = startCol; i <= lastCol; i++) {
                numbers.add(matrix[topRow][i]);
            }
            topRow++;

            for (int i = topRow; i <= bottomRow; i++) {
                numbers.add(matrix[i][lastCol]);
            }
            lastCol--;

            if (topRow <= bottomRow) {
                for (int i = lastCol; i >= startCol; i--) {
                    numbers.add(matrix[bottomRow][i]);
                }
                bottomRow--;
            }

            if (startCol <= lastCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    numbers.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        return numbers;
    }
}

public class p12_Spiral {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: Square Matrix
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Spiral order of matrix1: " + solution.spiralOrder(matrix1));

        // // Example 2: Rectangular Matrix (more rows)
        // int[][] matrix2 = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 },
        // { 10, 11, 12 }
        // };
        // System.out.println("Spiral order of matrix2: " +
        // solution.spiralOrder(matrix2));

        // // Example 3: Rectangular Matrix (more columns)
        // int[][] matrix3 = {
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 }
        // };
        // System.out.println("Spiral order of matrix3: " +
        // solution.spiralOrder(matrix3));

        // // Example 4: Single row
        // int[][] matrix4 = {
        // { 1, 2, 3, 4, 5 }
        // };
        // System.out.println("Spiral order of matrix4: " +
        // solution.spiralOrder(matrix4));

        // // Example 5: Single column
        // int[][] matrix5 = {
        // { 1 },
        // { 2 },
        // { 3 },
        // { 4 },
        // { 5 }
        // };
        // System.out.println("Spiral order of matrix5: " +
        // solution.spiralOrder(matrix5));

        // // Example 6: Empty matrix
        // int[][] matrix6 = {};
        // System.out.println("Spiral order of matrix6: " +
        // solution.spiralOrder(matrix6));
    }
}

/*
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 * public class Solution {
 * public List<Integer> spiralOrder(int[][] matrix) {
 * List<Integer> numbers = new ArrayList<>();
 * 
 * if (matrix == null || matrix.length == 0) {
 * return numbers;
 * }
 * 
 * int topRow = 0;
 * int lastCol = matrix[0].length - 1;
 * int bottomRow = matrix.length - 1;
 * int startCol = 0;
 * 
 * while (topRow <= bottomRow && startCol <= lastCol) {
 * for (int i = startCol; i <= lastCol; i++) {
 * numbers.add(matrix[topRow][i]);
 * }
 * topRow++;
 * 
 * for (int i = topRow; i <= bottomRow; i++) {
 * numbers.add(matrix[i][lastCol]);
 * }
 * lastCol--;
 * 
 * if (topRow <= bottomRow) {
 * for (int i = lastCol; i >= startCol; i--) {
 * numbers.add(matrix[bottomRow][i]);
 * }
 * bottomRow--;
 * }
 * 
 * if (startCol <= lastCol) {
 * for (int i = bottomRow; i >= topRow; i--) {
 * numbers.add(matrix[i][startCol]);
 * }
 * startCol++;
 * }
 * }
 * return numbers;
 * }
 * 
 * public static void main(String[] args) {
 * Solution solution = new Solution();
 * 
 * // Example 1: Square Matrix
 * int[][] matrix1 = {
 * { 1, 2, 3 },
 * { 4, 5, 6 },
 * { 7, 8, 9 }
 * };
 * System.out.println("Spiral order of matrix1: " +
 * solution.spiralOrder(matrix1));
 * }
 * }
 */
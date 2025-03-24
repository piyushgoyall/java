import java.util.HashSet;
import java.util.Scanner;

public class p5_Sudoku_Check {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> boxSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !rowSet.add(board[i][j]))
                    return false;
                if (board[j][i] != '.' && !colSet.add(board[j][i]))
                    return false;

                int rowIndex = 3 * (i / 3) + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;
                if (board[rowIndex][colIndex] != '.' && !boxSet.add(board[rowIndex][colIndex]))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[9][9];

        System.out.println("Enter the Sudoku board row by row (use '.' for empty cells):");
        for (int i = 0; i < 9; i++) {
            String row = scanner.next();
            for (int j = 0; j < 9; j++) {
                board[i][j] = row.charAt(j);
            }
        }
        scanner.close();

        System.out.println("Is the Sudoku board valid? " + isValidSudoku(board));
    }
}

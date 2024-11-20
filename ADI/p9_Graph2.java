// Adjacency Matrix

public class p9_Graph2 {
    static void print(int[][] grid, int n) {
        for (int i = 0; i < grid.length; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {
                { 1, 1, 1, 0, 0, 0 },
                { 1, 0, 1, 1, 1, 0 },
                { 1, 1, 0, 0, 0, 1 },
                { 0, 1, 0, 0, 1, 1 },
                { 0, 1, 0, 1, 0, 0 },
                { 0, 0, 1, 1, 0, 0 }
        };
        print(grid, 6);
    }
}

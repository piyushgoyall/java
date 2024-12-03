//{ Driver Code Starts
// Initial template for JAVA

import java.io.*;
import java.util.*;

class p13_Graph6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                String[] s = br.readLine().trim().split(" ");
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution obj = new Solution();
            obj.shortestDistance(matrix);
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

// User function template for JAVA

class Solution {
    public void shortestDistance(int[][] mat) {
        int n = mat.length;

        // Initialize the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = Integer.MAX_VALUE; // Unreachable paths
                }
                if (i == j) {
                    mat[i][j] = 0; // Distance to self is zero
                }
            }
        }

        // Apply Floyd-Warshall Algorithm
        for (int v = 0; v < n; v++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][v] != Integer.MAX_VALUE && mat[v][j] != Integer.MAX_VALUE) {
                        mat[i][j] = Math.min(mat[i][j], mat[i][v] + mat[v][j]);
                    }
                }
            }
        }

        // Convert unreachable paths back to -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == Integer.MAX_VALUE) {
                    mat[i][j] = -1;
                }
            }
        }
    }
}

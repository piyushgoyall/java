// Adjacency List

import java.util.ArrayList;
import java.util.List;

public class p8_Graph1 {
    static List<List<Integer>> graph;

    static void create(int[][] edges, int n) {
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
    }

    public static void main(String[] args) {
        int n = 6;96++6
        int[][] edges = new int[][] {
                { 0, 1 },
                { 0, 2 },
                { 1, 5 },
                { 1, 3 },
                { 2, 4 },
                { 4, 5 },
        };

        create(edges, n);

        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
            System.out.println(graph.get(i));
        }
    }
}
// DFS

import java.util.ArrayList;
import java.util.List;

public class p12_Graph5 {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = new int[][] { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 1, 3 }, { 1, 4 }, { 2, 5 }, { 3, 4 }, { 3, 5 } };
        int src = 0;
        List<Integer> dfs = dfs(edges, n, src);
        System.out.println(dfs);
    }

    private static List<Integer> dfs(int[][] edges, int n, int src) {
        List<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[n];

        List<List<Integer>> graph = build(edges, n);
        helper(graph, src, visited, dfs);
        return dfs;
    }

    private static void helper(List<List<Integer>> graph, int src, boolean[] visited, List<Integer> dfs) {
        visited[src] = true;
        dfs.add(src);
        for (int nbr : graph.get(src)) {
            if (!visited[nbr]) {
                helper(graph, nbr, visited, dfs);
            }
        }

    }

    private static List<List<Integer>> build(int[][] edges, int n) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        return graph;
    }

}

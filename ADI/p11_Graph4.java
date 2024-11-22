import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p11_Graph4 {
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

    static int[] bfs(int src, int n) {
        int[] answer = new int[n];
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.add(src);
        visited[src] = true;
        int idx = 0;

        while (!(q.isEmpty())) {
            int curr = q.poll();
            answer[idx++] = curr;

            for (int nbr : graph.get(curr)) {
                if (!visited[nbr]) {
                    q.offer(nbr);
                    visited[nbr] = true;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] edges = new int[][] {
                { 0, 1 },
                { 0, 2 },
                { 1, 5 },
                { 1, 3 },
                { 2, 4 },
                { 4, 5 },
        };

        create(edges, n);

        int src = 0;
        int[] answer = bfs(src, n);

        System.out.println(Arrays.toString(answer));
    }
}

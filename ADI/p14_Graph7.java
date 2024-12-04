import java.io.*;
import java.lang.*;
import java.util.*;

// User function Template for Java

class Pair {
    int wt;
    int node;
    int parent;

    Pair(int wt, int node, int parent) {
        this.wt = wt;
        this.node = node;
        this.parent = parent;
    }
}

class Solution {

    static int[] spanningTree(int V, int E, List<List<int[]>> adj) {
        // int n = adj.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);
        boolean[] visited = new boolean[V];
        int[] ans = new int[V];
        int cost = 0;

        Arrays.fill(ans, -1);
        pq.offer(new Pair(0, 0, -1));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int wt = curr.wt;
            int node = curr.node;
            int parent = curr.parent;

            if (!visited[node]) {
                visited[node] = true;
                cost += wt;

                if (parent != -1) {
                    ans[node] = parent;
                }

                for (int[] arr : adj.get(node)) {
                    int nbr = arr[0];
                    int nbr_wt = arr[1];

                    if (!visited[nbr]) {
                        pq.offer(new Pair(nbr_wt, nbr, node));
                    }
                }
            }
        }
        return ans;
    }
}

public class p14_Graph7 {
    static BufferedReader br;
    static PrintWriter ot;

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s[] = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            List<List<int[]>> list = new ArrayList<>();
            for (int i = 0; i < V; i++)
                list.add(new ArrayList<>());
            for (int i = 0; i < E; i++) {
                s = br.readLine().trim().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int c = Integer.parseInt(s[2]);
                list.get(a).add(new int[] { b, c });
                list.get(b).add(new int[] { a, c });
            }
            // ot.println(new Solution().spanningTree(V, E, list));
            int[] result = new Solution().spanningTree(V, E, list);
            ot.println(Arrays.toString(result));
        }
        ot.close();
    }
}

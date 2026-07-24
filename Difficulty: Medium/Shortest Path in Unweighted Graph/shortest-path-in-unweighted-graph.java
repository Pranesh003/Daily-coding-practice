import java.util.*;

class Solution {
    public int shortestPath(int V, int[][] edges, int src, int dest) {
        // Handle edge case where source is destination
        if (src == dest) {
            return 0;
        }

        // 1. Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        // 2. Initialize tracking structures
        int[] dist = new int[V];
        Arrays.fill(dist, -1);
        Queue<Integer> queue = new LinkedList<>();

        // 3. Begin BFS traversal
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            // Early exit if destination is found
            if (curr == dest) {
                return dist[curr];
            }

            for (int neighbor : adj.get(curr)) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[curr] + 1;
                    queue.add(neighbor);
                }
            }
        }

        return -1;
    }
}

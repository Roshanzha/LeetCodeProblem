class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, List<int[]>> adj = new HashMap<>();
        int[] visited = new int[n];
        Arrays.fill(visited, Integer.MAX_VALUE);
        visited[src] = 0;
        
        for (int[] flight : flights) {
            adj.computeIfAbsent(flight[0], key -> new ArrayList<>()).add(new int[]{flight[1], flight[2]});
        }
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{src, 0});
        K++;
        
        while (!queue.isEmpty() && K-- > 0) {
            int size = queue.size();
            while (size-- > 0) {
                int[] curr = queue.poll();
                int currNode = curr[0];
                int currPrice = curr[1];
                if (adj.containsKey(currNode)) {
                    for (int[] neighbor : adj.get(currNode)) {
                        int newPrice = currPrice + neighbor[1];
                        if (newPrice < visited[neighbor[0]]) {
                            visited[neighbor[0]] = newPrice;
                            queue.offer(new int[]{neighbor[0], newPrice});
                        }
                    }
                }
            }
        }
        
        return visited[dst] == Integer.MAX_VALUE ? -1 : visited[dst];
    }
}

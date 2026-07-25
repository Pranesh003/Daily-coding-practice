class Solution {
    
    static class pair{
        int node;
        int distance;
        pair(int node,int distance){
            this.node=node;
            this.distance=distance;
        }
    }
    
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<pair>> graph=new ArrayList<>();
        
        for(int i=0;i<V;i++)
        graph.add(new ArrayList<>());
        
         for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new pair(v, w));
            graph.get(v).add(new pair(u, w)); 
        }
        
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->a.distance-b.distance);
        
        dist[src]=0;
        
        pq.offer(new pair(src,0));
        
        while(!pq.isEmpty()){
            pair current=pq.poll();
            
            int node=current.node;
            int distance=current.distance;
            
            if(distance>dist[node])
            continue;
            
            for(pair neighbor:graph.get(node)){
                if(distance+neighbor.distance<dist[neighbor.node]){
                    dist[neighbor.node]=distance+neighbor.distance;
                    
                    pq.offer(new pair(neighbor.node,dist[neighbor.node]));
                }
            }
        }
        return dist;
    }
}
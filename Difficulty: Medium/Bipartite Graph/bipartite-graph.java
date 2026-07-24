class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        int[] color=new int[V];
        Arrays.fill(color,-1);
        
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(!bfs(graph,i,color))
                return false;
            }
        }
        return true;
    }
    
    public static boolean bfs(ArrayList<ArrayList<Integer>> graph, int start, int[] color){
        Queue<Integer>queue=new LinkedList<>();
        
        queue.offer(start);
        color[start]=0;
        
        while(!queue.isEmpty()){
            int node =queue.poll();
            
            for(int neighbor:graph.get(node)){
                if(color[neighbor]==-1){
                    color[neighbor]=1-color[node];
                    queue.offer(neighbor);
                }else if(color[neighbor]==color[node])
                return false;
            }
        }
        return true;
    }
}
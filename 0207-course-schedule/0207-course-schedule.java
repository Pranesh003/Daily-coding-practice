class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++)
        adj.add(new ArrayList<>());

        int[] indegree =new int[numCourses];

        for(int[] edge:prerequisites){
            int u=edge[0];
            int v=edge[1];

            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }

        int processed=0;
        while(!queue.isEmpty()){
            int node=queue.poll();
            processed++;

            for(int neighbor:adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0){
                    queue.offer(neighbor);
                }
            }
        }
        return processed==numCourses;
    }
}
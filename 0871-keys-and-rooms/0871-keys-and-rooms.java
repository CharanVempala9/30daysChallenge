class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int V=rooms.size();
        int[] vis=new int[V];
        Queue<Integer>q=new LinkedList<>();
        q.offer(0);
        vis[0]=1;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int it:rooms.get(node)){
                if(vis[it]==0){
                    vis[it]=1;
                    q.offer(it);
                }
            }
        }
        for(int i=0; i<V; i++){
            if(vis[i]==0)return false;
        }
        return true;
    }
}
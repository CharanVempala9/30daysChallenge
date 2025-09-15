class Solution {
    public boolean dfs(int node,int val,ArrayList<ArrayList<Integer>> ls,int[] vis){
        vis[node] = val;
        for(int it : ls.get(node)){
            if(vis[it] == -1){
                if(!dfs(it, 1 - val, ls, vis)) return false;
            }
            else if(vis[it] == val){
                return false;
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;

        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ls.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++){
            for(int val : graph[i]){
                ls.get(i).add(val);
            }
        }

        int[] vis = new int[n];
        for(int i = 0; i < n; i++){
            vis[i] = -1;
        }

        for(int i = 0; i < n; i++){
            if(vis[i] == -1){
                if(dfs(i, 0, ls, vis) == false)
                    return false;
            }
        }
        return true;
    }
}

class Solution {
    public int dfs(int r,int c,int[][] grid,int[][] vis){
        if(r>=grid.length || r<0 || c>=grid[0].length || c<0 || grid[r][c]==0){
            return 1;
        }
        if(vis[r][c]==1) return 0;
        vis[r][c]=1;
        int ans=0;
        ans+=dfs(r-1,c,grid,vis);
        ans+=dfs(r+1,c,grid,vis);
        ans+=dfs(r,c-1,grid,vis);
        ans+=dfs(r,c+1,grid,vis);
        return ans;

    }
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        boolean found=false;
        int[][] vis=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    ans=dfs(i,j,grid,vis);
                    found=true;
                    break;
                }
            }
            if(found)break;
        }
        return ans;
    }
}
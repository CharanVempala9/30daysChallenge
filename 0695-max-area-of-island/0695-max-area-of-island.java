class Solution {
    public int dfs(int r,int c,int[][] grid,int[][] vis){
        vis[r][c]=1;
        int[] rdir={-1,1,0,0};
        int[] cdir={0,0,-1,1};
        int ans=1;
        for(int i=0; i<4; i++){
            int nr=r+rdir[i];
            int nc=c+cdir[i];
            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && vis[nr][nc]==0 && grid[nr][nc]==1){
                ans+=dfs(nr,nc,grid,vis);
            }
        }
        return ans;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int max=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    int area=dfs(i,j,grid,vis);
                    max=Math.max(max,area);
                }
            }
        }
        return max;
    }
}
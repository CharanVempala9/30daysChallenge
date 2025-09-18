class Solution {    
    public int gen(int r,int c,int[][] grid,int[][] dp){
        if(r<0 || c<0 || grid[r][c]==1)return 0;
        if(r==0 && c==0) return 1;
        if(dp[r][c]!=-1)return dp[r][c];
        int down=gen(r-1,c,grid,dp);
        int right=gen(r,c-1,grid,dp);
        dp[r][c]=down+right;
        return dp[r][c];
    }
    
    public int uniquePathsWithObstacles(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return gen(n-1,m-1,grid,dp);
    }
}
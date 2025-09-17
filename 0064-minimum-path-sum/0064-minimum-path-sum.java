class Solution {
    public int gen(int r,int c,int[][] grid,int[][] dp){
        if(r<0 || c<0){
            return (int)1e9;
        }
        if(r==0 && c==0) return grid[r][c];
        if(dp[r][c]!=-1)return dp[r][c];
        int up=gen(r-1,c,grid,dp);
        int left=gen(r,c-1,grid,dp);
        int min=Math.min(left,up);
        dp[r][c]= min+grid[r][c];
        return dp[r][c];
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return gen(m-1,n-1,grid,dp);
    }
}
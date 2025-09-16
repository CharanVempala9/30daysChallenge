class Solution {
  public int findTargetSumWays(int[] nums, int target) {
      int n = nums.length, sum = 0;
      for (int num : nums) sum += num;
      
      if (sum < target || (sum - target) % 2 != 0) return 0;
      
      int tar = (sum - target) / 2;
      
      int[][] dp = new int[n+1][tar+1];
      for (int i = 0; i <= n; i++) dp[i][0] = 1;
      
      for (int i = 1; i <= n; i++) {
          for (int j = 0; j <= tar; j++) {
              if (j >= nums[i-1]) {
                  dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
              } else {
                  dp[i][j] = dp[i-1][j];
              }
          }
      }
      
      return dp[n][tar];
  }
}
class Solution {
    public boolean isposs(int mid,int[] nums,int k){
        int temp=mid;
        int cnt=1;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>mid) return false;
            if(nums[i]<=temp){
                temp-=nums[i];
            }
            else{
                cnt++;
                temp=mid-nums[i];
            }
        }
        return cnt<=k;
    }
    public int splitArray(int[] nums, int k) {
        int l=0;
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        int h=sum;
        int ans=0;
        while(l<=h){
            int  mid=l+(h-l)/2;
            if(isposs(mid,nums,k)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
class Solution {
    public boolean isposs(int mid,int[] weights,int days){
        int cnt=1;
        int k=mid;
        int n=weights.length;
        for(int i=0; i<n; i++){
            if (weights[i] > mid) return false;
            if(weights[i]<=k){
                k-=weights[i];
            }
            else{
                cnt++;
                k=mid-weights[i];
            }
        }
        return cnt<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=1;
        int sum=0;
        for(int w:weights){
            sum+=w;
        }
        int h=sum;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isposs(mid,weights,days)){
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




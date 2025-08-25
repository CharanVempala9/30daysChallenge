class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zcnt=0;
        int ocnt=0;
        int tcnt=0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                zcnt++;
            }
            else if(nums[i]==1){
                ocnt++;
            }
            else{
                tcnt++;
            }
        }
        int idx=0;
        while(idx<zcnt){
            nums[idx]=0;
            idx++;
        }
        while(idx-zcnt<ocnt){
            nums[idx]=1;
            idx++;
        }
        while(idx-zcnt-ocnt<tcnt){
            nums[idx]=2;
            idx++;
        }
    }
}
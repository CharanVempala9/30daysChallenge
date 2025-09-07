class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        int idx=1;
        int n=nums.length;
        if(n==0 || n==1) return n;
        for(int i=1; i<n; i++){
            if(nums[i]!=nums[i-1]){
                nums[idx]=nums[i];
                idx++;
            }
        }
        //System.out.println(idx);
        return idx;
    }
}
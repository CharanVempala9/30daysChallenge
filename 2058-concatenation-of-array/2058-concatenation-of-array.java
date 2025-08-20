class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2*n];
        int idx=0;
        for(int i=0; i<n; i++){
            arr[idx] = nums[i];
            idx++;
        }
        for(int i=0; i<n; i++){
            arr[idx] = nums[i];
            idx++;
        }
        return arr;
    }
}
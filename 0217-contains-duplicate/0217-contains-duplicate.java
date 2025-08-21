class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
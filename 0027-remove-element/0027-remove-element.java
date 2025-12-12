class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(val==nums[i]){
                cnt++;
            }
        }
        int idx=n-cnt;
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=idx; i<n; i++){
            if(nums[i]!=val)
            ls.add(nums[i]);
        }
        int j=0;
        for(int i=0; i<idx; i++){
            if(nums[i]==val){
                nums[i]=ls.get(j);
                j++;
            }
        }
        return n-cnt;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0; i<n; i++){
            hs.add(nums[i]);
        }
        int max=0;
        for(int val:hs){
            if(!hs.contains(val-1)){
                int curr=val;
                int cnt=1;
                while(hs.contains(curr+1)){
                    curr++;
                    cnt++;
                }
                max=Math.max(max,cnt);
            }
        }
        return max;
    }
}
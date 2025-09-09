class Solution {
    public void f(int idx,int[] nums,List<List<Integer>>ls,List<Integer>temp){
        if(idx>=nums.length){
            List<Integer>res=new ArrayList<>(temp);
            ls.add(res);
            return;
        }
        int val=nums[idx];
        //take into list
        temp.add(val);
        f(idx+1,nums,ls,temp);
        //not take into list
        temp.remove(temp.size()-1);
        int next = idx + 1;
        while (next < nums.length && nums[next] == nums[idx]) {
            next++;
        }
        f(next,nums,ls,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ls=new ArrayList<>();
        Arrays.sort(nums);
        f(0,nums,ls,new ArrayList<>());
        return ls;
    }
}
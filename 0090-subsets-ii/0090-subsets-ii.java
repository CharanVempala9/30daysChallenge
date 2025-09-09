class Solution {
    public void f(int idx,int[] nums,List<List<Integer>>ls,List<Integer>temp,HashSet<List<Integer>>hs){
        if(idx>=nums.length){
            List<Integer>res=new ArrayList<>(temp);
            if(!hs.contains(res)){
                hs.add(res);
                ls.add(res);
            }
            return;
        }
        int val=nums[idx];
        //take into list
        temp.add(val);
        f(idx+1,nums,ls,temp,hs);
        //not take into list
        temp.remove(temp.size()-1);
        f(idx+1,nums,ls,temp,hs);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ls=new ArrayList<>();
        HashSet<List<Integer>>hs=new HashSet<>();
        Arrays.sort(nums);
        f(0,nums,ls,new ArrayList<>(),hs);
        return ls;
    }
}
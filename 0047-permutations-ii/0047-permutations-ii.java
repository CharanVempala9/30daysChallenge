class Solution {
    public void f(int[] nums,List<List<Integer>>ls,List<Integer>temp,boolean[] b){
        if(temp.size()==nums.length){
            ArrayList<Integer>res=new ArrayList<>(temp);
            ls.add(res);
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(b[i]==true) continue;
            if(i>0 && nums[i]==nums[i-1] && !b[i-1]) continue;
            b[i]=true;
            temp.add(nums[i]);
            f(nums,ls,temp,b);
            temp.remove(temp.size()-1);
            b[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        Arrays.sort(nums);
        f(nums,ls,new ArrayList<>(),new boolean[nums.length]);
        return ls;
    }
}
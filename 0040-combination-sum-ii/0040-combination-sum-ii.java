class Solution {
    public void f(int idx, int[] cand,int t,List<List<Integer>>ls,List<Integer>temp){
        if(t==0){
            ls.add(new ArrayList<>(temp));
            return;
        }
        if(idx>=cand.length || t<0) return;
        int val=cand[idx];
        if(t-val>=0){
            temp.add(val);
            f(idx+1,cand,t-val,ls,temp);
            temp.remove(temp.size()-1);
        }
        int nxt=idx+1;
        while(nxt<cand.length && cand[nxt]==cand[idx]){
            nxt++;
        }
        f(nxt,cand,t,ls,temp);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ls=new ArrayList<>();
        Arrays.sort(candidates);
        f(0,candidates,target,ls,new ArrayList<>());
        return ls;
    }
}
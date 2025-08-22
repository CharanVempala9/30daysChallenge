class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=1; i<=n; i++){
            ls.add(i);
        }
        int idx=0;
        while(ls.size()!=1){
            idx = (idx+k-1)%ls.size();
            ls.remove(idx);
        }
        return ls.get(0);
    }
}
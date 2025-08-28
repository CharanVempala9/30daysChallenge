class RecentCounter {
    //Queue<Integer> q;
    ArrayList<Integer> ls;
    public RecentCounter() {
        //q=new LinkedList<>();
        ls=new ArrayList<>();
    }
    
    public int ping(int t) {
        //q.add(t);
        ls.add(t);
        int val=t-3000;
        int cnt=0;
        for(int i=0; i<ls.size(); i++){
            if(ls.get(i)>=val && ls.get(i)<=t){
                cnt++;
            }
        }
        return cnt;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
class Pair{
    int cnt;
    int idx;
    public Pair(int cnt,int idx){
        this.cnt=cnt;
        this.idx=idx;
    }
}
class Solution {
    public boolean doesAliceWin(String s) {
        ArrayList<Pair>ls=new ArrayList<>();
        int cnt=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                cnt++;
            }
            ls.add(new Pair(cnt,i));
        }
        if(cnt==0) return false;
        int len=ls.size()-1;
        while(len>=0){
            Pair p=ls.get(len);
            if(p.cnt%2==1){
                int Vcnt=p.cnt;
                cnt-=Vcnt;
                break;
            }
            len--;
        }
        if(cnt!=0 && cnt%2==0) return false;
        return true; 
    }
}
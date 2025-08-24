class Solution {
    public int sq(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans+=rem*rem;
            n=n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        HashSet<Integer>hs=new HashSet<>();
        while(n!=1){
            int val=sq(n);
            //System.out.println(val);
            if(!hs.contains(val)){
                hs.add(val);
            }
            else{
                return false;
            }
            n=val;
        }
        return true;
    }
}
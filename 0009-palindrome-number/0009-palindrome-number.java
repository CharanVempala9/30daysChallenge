class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        List<Integer>ls=new ArrayList<>();
        while(x>0){
            int rem=x%10;
            ls.add(rem);
            x=x/10;
        }
        int idx=1;
        for(int i=0; i<ls.size()/2; i++){
            if(ls.get(i)!=ls.get(ls.size()-idx)){
                return false;
            }
            idx++;
        }
        return true;
    }
}
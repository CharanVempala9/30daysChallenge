class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int cnt=0;
        while(i>=0){
            if(s.charAt(i)==' '){
                if(cnt!=0){
                    break;
                }
                i--;
            }
            if(s.charAt(i)!=' '){
                cnt++;
                i--;
            }
        }
        return cnt;
    }
}
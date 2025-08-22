class Solution {
    public boolean isPalindrome(int x) {
        int val=x;
        if(x<0){
            return false;
        }
        int mul=0;
        while(x>0){
            int rem=x%10;
            mul = mul*10+rem;
            x=x/10;
        }
        if(mul==val){
            return true;
        }
        return false;
    }
}
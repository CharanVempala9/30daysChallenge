class Solution {
    public int addDigits(int num) {
        while(num>9){
            int n=0;
            while(num>0){
                int rem=num%10;
                n+=rem;
                num/=10;
            }
            num=n;
        }
        return num;
    }
}
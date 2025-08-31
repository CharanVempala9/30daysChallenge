class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1;
        int h=num;
        while(l<=h){
            int mid=l+(h-l)/2;
            long val=(long)mid*mid;
            if(val== num){
                return true;
            }
            else if(val<num){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
}
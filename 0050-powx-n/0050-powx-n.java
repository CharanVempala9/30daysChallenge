class Solution {
    public double fun(double x,int n){
        if(n==1)return x;
        if(n==0)return 1;
        double hf=fun(x,n/2);
        if(n%2==0){
            return (double)hf*hf;
        }
        else{
            return (double)x*hf*hf;
        }
    }
    public double myPow(double x, int n) {
        if(n==1)return x;
        double ans=fun(x,n);
        if(n<0){
            return (double)1/ans;
        }
        return (double)ans;
    }
}

/*  n/2 if i compute half of it


*/
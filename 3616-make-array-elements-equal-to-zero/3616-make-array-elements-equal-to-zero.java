class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int[] pf=new int[n];
        int[] sf=new int[n];
        pf[0]=nums[0];
        sf[n-1]=nums[n-1];
        for(int i=1; i<n; i++)pf[i]=pf[i-1]+nums[i];
        for(int i=n-2; i>=0; i--)sf[i]=sf[i+1]+nums[i];
        for(int i=0; i<n; i++){
            if(nums[i]==0 && pf[i]==sf[i]){
                cnt+=2;
                System.out.print("enterd");
            }
            else if(nums[i]==0 && (pf[i]==sf[i]-1 || sf[i]==pf[i]-1)){
                //System.out.println(i);
                cnt++;
            }
        }
        return cnt;
    }
}
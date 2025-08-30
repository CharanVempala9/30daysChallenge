class NumArray {
    int[] pref;
    public NumArray(int[] nums) {
        int n=nums.length;
        pref=new int[n];
        pref[0]=nums[0];
        System.out.print(pref[0]+" ");
        for(int i=1; i<n; i++){
            pref[i] = pref[i-1]+nums[i];
            System.out.print(pref[i]+" ");
        }
    }
    
    public int sumRange(int left, int right) {
        if(left>0) return pref[right]-pref[left-1];
        return pref[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
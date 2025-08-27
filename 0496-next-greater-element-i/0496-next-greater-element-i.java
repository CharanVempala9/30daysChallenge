class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] ans=new int[n1];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0; i<n2; i++){
            hm.put(nums2[i],i);
        }
        for(int i=0; i<n1; i++){
            int val=nums1[i];
            boolean found=false;
            for(int j=hm.get(val); j<n2; j++){
                if(val<nums2[j]){
                    ans[i]=nums2[j];
                    found=true;
                    break;
                }
            }
            if(!found)ans[i]=-1;

        }
        return ans;
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>ls=new ArrayList<>();
        int n1=nums1.length;
        int n2=nums2.length;
        HashMap<Integer,Integer>hm2=new HashMap<>();
        for(int i=0; i<n2; i++){
            hm2.put(nums2[i],hm2.getOrDefault(nums2[i],0)+1);
        }
        for(int i=0; i<n1; i++){
            if(hm2.containsKey(nums1[i])){
                ls.add(nums1[i]);
                hm2.put(nums1[i],hm2.get(nums1[i])-1);
                if (hm2.get(nums1[i]) == 0) {
                    hm2.remove(nums1[i]);
                }
            }
        }
        int[] arr=new int[ls.size()];
        for(int i=0; i<ls.size(); i++){
            arr[i]=ls.get(i);
        }
        return arr;
    }
}
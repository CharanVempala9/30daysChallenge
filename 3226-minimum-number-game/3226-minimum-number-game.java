class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int n:nums){
            pq.add(n);
        }
        int i=0;
        while(!pq.isEmpty()){
            int f=pq.poll();
            int s=pq.poll();
            nums[i++]=s;
            nums[i++]=f;
        }
        return nums;
    }
}
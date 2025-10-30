class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;
        for(int n:gifts){
            sum+=n;
            pq.add(n);
        }
        long dsum=0;
        while(k-->0){
            int val=pq.poll();
            int base=(int)Math.sqrt(val);
            dsum+=val-base;
            pq.offer(base);
        }
        return sum-dsum;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, List<int[]>> hm = new HashMap<>();
        
        for (int[] pt : points) {
            int x = pt[0];
            int y = pt[1];
            int dist = x * x + y * y;  
            
            pq.offer(dist);
            hm.putIfAbsent(dist, new ArrayList<>());
            hm.get(dist).add(new int[]{x, y});
        }
        
        int i = 0;
        while (k-- > 0 && !pq.isEmpty()) {
            int d = pq.poll();
            int[] point = hm.get(d).remove(0); 
            res[i][0] = point[0];
            res[i][1] = point[1];
            i++;
        }
        
        return res;
    }
}

class MedianFinder {
    Queue<Integer> q1;
    Queue<Integer> q2;
    boolean even;

    public MedianFinder() {
        this.q1 = new PriorityQueue<>();
        this.q2 = new PriorityQueue<>(Collections.reverseOrder());
        this.even = true;
    }
    
    public void addNum(int num) {
        if (even) {
            q1.add(num);
            q2.add(q1.poll());
        } else {
            q2.add(num);
            q1.add(q2.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
        if (even) {
            return (double) (q1.peek() + q2.peek()) / 2.0;
        } else {
            return (double) q2.peek();
        }
    }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
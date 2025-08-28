class MyCircularQueue {
    Deque<Integer>dq;
    int size=0;
    public MyCircularQueue(int k) {
        dq=new LinkedList<>();
        this.size=k;
    }
    
    public boolean enQueue(int value) {
        if(dq.size()<size){
            dq.offer(value);
        }
        else{
            return false;
        }
        return true;
    }
    
    public boolean deQueue() {
        if(!dq.isEmpty()){
            dq.poll();
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(dq.isEmpty()) return -1;
        return dq.peekFirst();
    }
    
    public int Rear() {
        if(dq.isEmpty()) return -1;
        return dq.peekLast();
    }
    
    public boolean isEmpty() {
        return dq.isEmpty();
    }
    
    public boolean isFull() {
        return dq.size()==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
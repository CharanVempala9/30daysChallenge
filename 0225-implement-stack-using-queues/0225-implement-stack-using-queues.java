class MyStack {
    Queue<Integer>q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
        int size=q.size();
        for(int i=0; i<size-1; i++){
            int x=q.poll();
            q.offer(x);
        }
        return q.poll();
    }
    
    public int top() {
        int size=q.size();
        int x=0;
        for(int i=0; i<size; i++){
            x=q.poll();
            q.offer(x);
        }
        return x;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
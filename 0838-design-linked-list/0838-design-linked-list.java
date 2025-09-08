class MyLinkedList {
    ArrayList<Integer>ls;
    public MyLinkedList() {
        ls=new ArrayList<>();
    }
    
    public int get(int index) {
        if(index<ls.size())
        return ls.get(index);
        return -1;
    }
    
    public void addAtHead(int val) {
        ls.add(0,val);
    }
    
    public void addAtTail(int val) {
        ls.add(val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index<ls.size())
        ls.add(index,val);
        else if(index==ls.size()) addAtTail(val);
    }
    
    public void deleteAtIndex(int index) {
        if(index>=0 && index<ls.size())
        ls.remove(index);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
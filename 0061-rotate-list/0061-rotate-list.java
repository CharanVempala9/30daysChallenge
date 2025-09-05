/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||  k==0) return head;
        int size=0;
        ListNode node=head;
        while(node!=null){
            size++;
            node=node.next;
        }
        int rot=k%size;
        int upto=size-rot;
        node=head;
        int cnt=1;
        while(cnt<upto){
            cnt++;
            node=node.next;
        }
        //System.out.println("node.val"+" "+node.val);
        ListNode temp=node;
        while(node.next!=null){
            node=node.next;
        }
        node.next=head;
        head=temp.next;
        temp.next=null;
        return head;
    }
}
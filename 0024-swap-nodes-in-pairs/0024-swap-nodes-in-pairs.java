class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode Next = curr.next;     
            ListNode nextPair = Next.next;

            prev.next = Next;
            Next.next = curr;
            curr.next = nextPair;
            prev = curr;
            curr = nextPair;
        }

        return dummy.next;
    }
}

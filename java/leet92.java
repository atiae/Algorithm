package leetcode;


public class leet92 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseBetween(ListNode head,int left,int right){
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode g = dummy;
        ListNode p = dummy.next;
        for(int i=0;i<left-1;i++){
            g = g.next;
            p = p.next;
        }
        for(int i=0;i<right-left;i++){
            ListNode removed = p.next;
            p.next= p.next.next;

            removed.next = g.next;
            g.next = removed;
        }
        return dummy.next;
    }
}

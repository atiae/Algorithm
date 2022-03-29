package leetcode;

/**
 * leet142
 */
public class leet142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(true){
            if(fast == null && fast.next == null ){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)break;
        }
        fast = slow;
        if(fast!=head){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
    
}
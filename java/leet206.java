package leetcode;

public class leet206 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while(head!=null){
           ListNode temp = cur.next;
           cur.next = prev;
           prev = cur;
           cur = temp;
        }
        return prev;
    }

    public ListNode reverseList2(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
}

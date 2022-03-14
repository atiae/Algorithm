package leetcode;

public class leet24 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val =val;
            this.next = next;
        }
    }
    public ListNode swapPairs(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp = head.next;
        head.next=swapPairs(temp.next);
        head = temp;
        return temp;
    }
}

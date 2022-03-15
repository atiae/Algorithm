package leetcode;

public class leet83 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next =  next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
         while(cur!=null&&cur.next!=null){//因为测试的时候的链表可能给的[] 所以cur!=null的判定也要给上~
            if(cur.val == cur.next.val){
                //因为是升序排列 所以也只可能是挨着的二位相同辽~
                cur.next = cur.next.next;//删除重复的辣个cur.next
            }else{
                cur = cur.next;//cur继续前移
            }

        }
        return head;//返回结果链表
    }
        
}

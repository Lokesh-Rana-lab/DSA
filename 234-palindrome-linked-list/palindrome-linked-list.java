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
    ListNode rec(ListNode cur){
        if(cur==null || cur.next==null) return cur;
        ListNode right = cur.next;
        ListNode new_head = rec(right);
        right.next = cur;
        cur.next=null;
        return new_head;
    }
    public boolean isPalindrome(ListNode head) {
    //     ListNode head2=new ListNode(1);
    //      ListNode pre=null;
    //     ListNode agla=null;
    //     ListNode curr=head;
    //     while(curr!=null){
    //         ListNode a=new ListNode(curr.val);
    //         agla = curr.next;
    //         a.next=pre;
    //         pre=a;
    //         curr=agla;
    //     }
    //     while(head!=null){
    //         if(head.val!=pre.val){
    //            return false;
            
    //         }
    //             head=head.next;
    //             pre=pre.next;
        
    //     }
    //     return true;

    ListNode slow = head;
    ListNode fast = head;
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast = fast.next.next;
    }
    ListNode new_head = rec(slow.next);
    ListNode ptr1=head,ptr2=new_head;
    while(ptr1!=null && ptr2!=null){
        if(ptr1.val!=ptr2.val) return false;
        ptr1=ptr1.next;
        ptr2=ptr2.next;

    }
    return true;
    }
}
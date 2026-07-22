
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return sol(l1,l2);
    }
    public ListNode sol(ListNode l1,ListNode l2){
        int carry=0;
        ListNode head=null;
        ListNode tail=null;
        while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val+carry;
            int val=sum%10;
            carry=sum/10;
            ListNode nn = new ListNode();
            nn.val=val;
            if(head==null){
                head=nn;
                tail=nn;

            }else{
                tail.next=nn;
                tail=nn;
            }
            l1=l1.next;
            l2=l2.next;
            }
            while(l1!=null){
                int sum=l1.val+carry;
                ListNode nn=new ListNode();
                int val=sum%10;
                carry=sum/10;
                nn.val=val;
                tail.next=nn;
                tail=nn;
               l1= l1.next;
            }
            while(l2!=null){
                int sum=l2.val+carry;
                ListNode nn=new ListNode();
                int val=sum%10;
                carry=sum/10;
                nn.val=val;
                tail.next=nn;
                tail=nn;
                l2=l2.next;}

        if(carry!=0){
            ListNode nn=new ListNode();
            nn.val=carry;
            tail.next=nn;
            tail=nn;
        }
        return head;
    }
}
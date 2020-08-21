public class Llcycle2 {
    public ListNode detectCycle(ListNode head) {
       if(head==null){
            return null;
        }
        ListNode slow,fast;
        slow=head;
        fast=head;
        boolean n=true;
        while(slow!=fast||n==true){
            if(fast==null||fast.next==null){
                return null;
            }
            n=false;
            slow=slow.next;
            fast=fast.next.next;
        }
        while(head!=slow){
            head=head.next;
            if(head==slow){
                break;
            }
            slow=slow.next;        
        }
        return head;
    }
    }

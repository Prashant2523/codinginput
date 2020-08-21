class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head = null, temp = null, temp1 = l1, temp2 = l2;
        while(temp1!=null && temp2!=null){
            ListNode block = new ListNode();
            if(temp1.val<temp2.val){
                block.val = temp1.val;
                temp1 = temp1.next;
            }
            else{
                block.val = temp2.val;
                temp2 = temp2.next;
            }
            if(head==null){
                head = block;
                temp = block;
            }
            else{
                temp.next = block;
                temp = temp.next;
            }
        }
        if(temp1!=null) temp.next = temp1;
        if(temp2!=null) temp.next = temp2;
        
        return head;
    }
}

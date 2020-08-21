class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }
        head = new ListNode(Integer.MAX_VALUE, head); // This solve if the first node is duplicate
        ListNode current = head;
        ListNode prev = head;
        boolean isDuplicate = false;
        while(current != null && current.next != null) {
            if(current.val == current.next.val) {
                current.next = current.next.next;
                isDuplicate = true;
            } else if(isDuplicate) {
                prev.next = current.next;
                current = current.next;
                isDuplicate = false;
            } else {
                prev = current;
                current = current.next;
            }
        }
		
        if(isDuplicate) { // This solve if the last node is duplicate
            prev.next = null;
        }
        return head.next;
    }
}

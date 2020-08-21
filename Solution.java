public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
        return false;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        do {
            if (fastPointer == null || fastPointer.next == null) {
                return false;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }while(slowPointer != fastPointer);
        return true;
    }
}

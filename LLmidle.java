class Solution {
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode st = head;
        while(st!= null){
            n++;
            st = st.next;
        }
        
        n= n/2;
        int i = 0;
        st = head;
        
        while(i < n){
            i++;
            st = st.next;
        }
        
        return st;
        
        
    }
}

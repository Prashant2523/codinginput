class Solution {
    
    ListNode result;
    public ListNode swapPairs(ListNode head) {
        result = head;
        helper(head);
        return result;
    }
    
    //First Node
    public void helper(ListNode curr){
        
        //Null List
        if(curr==null)
            return;
        
        //Jumping onto the second node
        helper(curr,curr.next);
        
    }
    
    //Second Node
    public void helper(ListNode prev,ListNode curr){
        
        //We have reached the end of List
        if(curr==null)
            return;
        
        prev.next = curr.next;
        curr.next = prev;
        result = curr;
        
        //Jumping onto the subsequent nodes
        helper(curr,prev,prev.next,false);
        
        
    }
    
    //Subsequent Nodes
    public void helper(ListNode prevofprev,ListNode prev,ListNode curr,boolean isEven){
        
        //We have reached the end of List
        if(curr==null)
            return;

        else if(isEven){
            prev.next = curr.next;
            curr.next = prev;
            prevofprev.next = curr;
            helper(curr,prev,prev.next,!isEven);
        }
        else{
            helper(prev,curr,curr.next,!isEven);
        }
    }
}

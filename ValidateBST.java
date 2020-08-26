class Solution {
    TreeNode lastVisitedNode;
    
    public boolean isValidBST(TreeNode root) {
        return inOrderTraversal(root);
    }
    
    public boolean inOrderTraversal(TreeNode root) {
        boolean leftStatus = true;
        boolean rightStatus = true;
        if(root!=null) {
            leftStatus = inOrderTraversal(root.left);  
            if(lastVisitedNode == null || lastVisitedNode.val < root.val) {
                lastVisitedNode = root;
            } else {
                if(lastVisitedNode.val >= root.val) {
                    return false;
                }
            } 
            rightStatus = inOrderTraversal(root.right);
        }
        return leftStatus && rightStatus;
    }    
}

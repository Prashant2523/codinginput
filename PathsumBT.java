
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
       return root != null && (((sum-root.val)==0 && root.left==null && root.right==null) || 
            (root.left != null && hasPathSum(root.left, sum-root.val)) || 
            (root.right != null && hasPathSum(root.right, sum-root.val)));
        
    }
}

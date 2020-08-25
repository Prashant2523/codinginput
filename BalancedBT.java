class Solution {
    public boolean isBalanced(TreeNode root) {
        return validateHeight(root) != -1;
    }
    public int validateHeight(TreeNode root) {
        if (root == null) return 0;
        int leftSubtree = validateHeight(root.left);
        int rightSubtree = validateHeight(root.right);
        if (Math.abs(leftSubtree - rightSubtree) > 1 || 
            leftSubtree == -1 || rightSubtree == -1 ) return -1;     
        return Math.max(leftSubtree + 1, rightSubtree + 1);
    }   
}

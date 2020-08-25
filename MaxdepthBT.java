class Solution {
     public int maxDepth(TreeNode root) {
        return findDepth(root, 0);
    }
    
    public int findDepth(TreeNode node, int count) {
        if (node == null) { return count; }
        return Math.max(findDepth(node.left, count+1) , findDepth(node.right, count+1));
    }
}

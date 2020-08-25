class Solution {
    
    Map<TreeNode, Integer> map;
    
    public int height(TreeNode node) {
        if(node == null) 
            return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        int ht = 1 + Math.max(lh, rh);
        map.put(node, ht);
        return ht;
    }
    
    public int diameter(TreeNode node) {
        if(node == null) {
            return 0;
        }
        
        int diam1 = 1 + map.getOrDefault(node.left, 0) + map.getOrDefault(node.right, 0);
        int diam2 = diameter(node.left);
        int diam3 = diameter(node.right);
        
        return Math.max(diam3, Math.max(diam1, diam2));
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        map = new HashMap<>();
        height(root);
        
        int diam = diameter(root);
        return Math.max(diam - 1, 0);
    }
}

class Solution {
    Map<Integer, Integer> depthMap = new HashMap();
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList();
        
        traversal(root, 0);
        
        for(int i : depthMap.keySet()) {
            ans.add(depthMap.get(i));
        }
        return ans;
    }
    
    private void traversal(TreeNode node, int depth) {
        if(node == null) {
            return;
        }
        
        traversal(node.right, depth+1);
        if(!depthMap.containsKey(depth)) {
            depthMap.put(depth, node.val);
        }
        traversal(node.left, depth+1);
    }
}

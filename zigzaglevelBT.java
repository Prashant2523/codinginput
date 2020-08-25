class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        
        if(root==null)
            return result;
        
        queue.offer(root);
        int level = 0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
                if(level%2==0)
                    currentLevel.add(node.val);
                else
                    currentLevel.add(0, node.val);
            }
            result.add(currentLevel);
            level++;
        }
        return result;
    }
}

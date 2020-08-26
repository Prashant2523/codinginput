class Solution {
    public void flatten(TreeNode root) {
           dfs(root, null);
    }
        
    TreeNode dfs(TreeNode root, TreeNode p){
        if(root == null) 
            return p;
    
        if(p != null){
            p.left = null;
            p.right = root;
        }
        
        return dfs(root.right, dfs(root.left, root));
    }

        
    }

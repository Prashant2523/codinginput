class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root==null)
        {
            TreeNode t=new TreeNode(val);
            return t;
        }
        if(val<root.val)
        {
            root.left=insertIntoBST(root.left,val);
            return root;
        }
        root.right=insertIntoBST(root.right,val);
        return root;
        
    }
}

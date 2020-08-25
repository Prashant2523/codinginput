private TreeNode helper(TreeNode root,int p,int q){
    if(root==null)
        return null;
    if(root.val==p || root.val==q)
        return root;
     TreeNode left=helper(root.left,p,q);
    TreeNode right=helper(root.right,p,q);
      if(left!=null && right!=null)
        return root;
     return (left==(null)?right:left);
    
}

public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root==p || root==q)
        return root;
    TreeNode left=helper(root.left,p.val,q.val);
    TreeNode right=helper(root.right,p.val,q.val);
    if(left!=null && right!=null)
        return root;
    return (left==(null)?right:left);
    
}

}

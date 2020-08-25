class Solution {
     public boolean isSymmetric(TreeNode root) {
    return isSymmetricValdate(root,root);
    }
    public boolean  isSymmetricValdate(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null || root1.val!=root2.val){
            return false;
        }
            
       boolean validate=isSymmetricValdate(root1.left,root2.right) &&
                        isSymmetricValdate(root2.right,root1.left);
    return validate;
    }
}

  int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    
    public int helper(TreeNode root) {
        if(root==null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        int temp = findMax(root.val, root.val+l, root.val+r);
        int temp1 = findMax(temp, root.val+l+r);
        if(temp1>max) max = temp1;
        return temp;
    }
    
    public int findMax(int... vals){
        int maxi = Integer.MIN_VALUE;
        for(int i: vals) {
            if(i>maxi) maxi = i;
        }
        return maxi;
    }
}

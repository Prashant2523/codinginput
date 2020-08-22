class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<=nums.length;i++){
            backtrack(i,new ArrayList<Integer>(),0,nums);
        }
        return ans;
    }
    private void backtrack(int n, ArrayList<Integer> curr, int start, int[] nums){
        if(curr.size()==n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i-1]==nums[i])
                continue;
            curr.add(nums[i]);
            backtrack(n,curr,i+1,nums);
            curr.remove(curr.size()-1);
        }
    }
}

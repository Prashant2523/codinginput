class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int temp=0;
        
        for(int i: nums)
            sum=sum+i;
        for(int i=0;i<nums.length;i++)
        {
            
            if(2*temp==sum-nums[i])
            return i;
            temp=temp+nums[i];
        }
        
    return -1;
    }
}

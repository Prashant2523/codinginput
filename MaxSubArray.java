class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int maxValue = Integer.MIN_VALUE;
      int start = 0, sum = 0;
      for(int end = 0; end < nums.length ; end++){
        sum += nums[end];
        if(end >= k-1){
          if(sum > maxValue){
            maxValue = sum;
          }
          sum -= nums[start];
          start++;
        }
      }
      return (maxValue + 0.0)/k;
    }
}

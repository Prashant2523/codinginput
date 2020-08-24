class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] numsCopy = nums.clone();
        
        Arrays.sort(numsCopy); // in-place sorting in ascending order
        
        for(int i=0; i<numsCopy.length; i++) {
            if (i!=0 && numsCopy[i]==numsCopy[i-1]) {
                continue; // only keep the first appeared element's index(= # elements are smaller) in map
            } else {
                map.put(numsCopy[i], i);
            }
        }
        
        for(int i=0; i<nums.length; i++) {
            ans[i] = map.get(nums[i]);
        }
        
        return ans;
    }
}

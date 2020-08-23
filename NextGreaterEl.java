class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         Map map = new HashMap<>();
        int max = nums2.length == 0 ? 0 : nums2[nums2.length-1];
        for (int i = nums2.length-1; i >= 0; i--) {
            if (nums2[i] >= max){
                map.put(Integer.valueOf(nums2[i]),Integer.valueOf(-1));
                max = nums2[i];
            }else{
                int temp = nums2[i+1];
                while(temp < nums2[i]){
                    temp = (Integer)map.get(Integer.valueOf(temp));
                }
                map.put(Integer.valueOf(nums2[i]),Integer.valueOf(temp));
            }
        }
        int[] nums3 = new int[nums1.length];
        for (int j = 0; j < nums1.length; j++) {
            nums3[j] = (Integer)map.get(Integer.valueOf(nums1[j]));
        }
        return nums3;
    
    }
}

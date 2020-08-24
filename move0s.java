class Solution {
    public void moveZeroes(int[] nums) {
          int pointer = 0;
        
        //the length of the array
        int length = nums.length;
        
        //if array is empty or the length is 1 then simply return
        if (length == 0 || length == 1) return;
        
        for (int current = 0; current < length; current++)
        {
            //if element is not a zero then increment pointer and 
            //initialize the pointer to be equal to current element
            if (nums[current] != 0)
            {
                nums[pointer] = nums[current];
                pointer++;
            }
        }
        
        //make every element that is after the pointer to be zero
        for (int j = pointer; j < length; j++)
        {
            nums[j] = 0;
        }
        
    }
}

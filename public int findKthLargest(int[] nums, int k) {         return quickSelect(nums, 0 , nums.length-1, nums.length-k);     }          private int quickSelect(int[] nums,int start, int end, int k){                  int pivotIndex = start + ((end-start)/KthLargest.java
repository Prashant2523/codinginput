  class solution{
  public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0 , nums.length-1, nums.length-k);
    }
    
    private int quickSelect(int[] nums,int start, int end, int k){
        
        int pivotIndex = start + ((end-start)/2);
        int sortedPivotIndex = sortPivotIndex(nums,start,end,pivotIndex);
        
        if(sortedPivotIndex == k) return nums[k];
        else if(sortedPivotIndex < k) return quickSelect(nums, sortedPivotIndex + 1 , end, k);
        else return quickSelect(nums, start , sortedPivotIndex - 1, k);
        
    }  
    
    private int sortPivotIndex(int[] nums,int start, int end, int pivotIndex){
        
        int pivot = nums[pivotIndex];
        swap(nums,pivotIndex,end);
        pivotIndex = start;
        
        for(int i = start; i < end; i++){
            if(nums[i] < pivot) {
                swap(nums,pivotIndex,i);
                pivotIndex++;
            }
        }
        
        swap(nums,pivotIndex,end);
        
        return pivotIndex;
        
    }
    
    private void swap(int[] nums,int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    }

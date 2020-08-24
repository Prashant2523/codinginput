class Solution {
public void rotate(int[] nums, int k)
{
int x=0,y=0;
int n=nums.length;
k=k%n;
int []temp=new int[k];
for(int i=n-k;i<n;i++)
{
temp[y++]=nums[i];
}
//Shift the elements to the right in the original array
for(int i=n-k-1;i>=0;i--)
{
nums[i+k]=nums[i];
}

    for(int i=0;i<k;i++)
    {
    	nums[i]=temp[i];
    }
    
}

}

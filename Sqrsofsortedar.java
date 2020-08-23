class Solution {
    public int[] sortedSquares(int[] a) {
        int i=0,j=a.length-1;
        int ans[] = new int[a.length];
        int k=j;
        while(i!=j)
        {
            if(a[i]*a[i]>a[j]*a[j])
            {
                ans[k]=a[i]*a[i];
                i++;
            }
            else
            {
                ans[k]=a[j]*a[j];
                j--;
            }
            k--;
        }
        ans[0]=a[i]*a[i];
        return ans;
    }
}

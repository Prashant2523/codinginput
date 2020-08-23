import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int min = Arrays.stream(candies).max().getAsInt();
        //int min=(Arrays.asList(candies));
        List<Boolean> s=new ArrayList();
        for(int i=0;i<candies.length;i++)
        {
            if((candies[i]+extraCandies) < min) s.add(false);
            else s.add(true);
        }
        return s;
        
    }
}

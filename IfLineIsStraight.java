class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2)return true;
     //// difference between y coordinates      
        float y=((float)coordinates[1][1]-coordinates[0][1]);
		//// difference between x coordinates   
        float x=((float)coordinates[1][0]-coordinates[0][0]);
        
      
        for(int i=1;i<coordinates.length;i++){
		/// check if diffrence of x coordinates ==0 to avoid dividing by zero
            if(x==0){
                if(((float)coordinates[i][0]-coordinates[i-1][0]) !=x)return false;
            }
            else if (  ((float)coordinates[i][1]-coordinates[i-1][1]) /((float)coordinates[i][0]-coordinates[i-1][0]) !=(y/x) )return false;
        }

        return true;
    }
}

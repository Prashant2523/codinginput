class Solution {
    public String minWindow(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        String ans = "";
        
        if(tlen > slen || slen == 0 || tlen == 0){
            return ans;
        }
        
        int [] dict = new int[128];
        
        for(char c:t.toCharArray()){
            dict[c]++;
        }
        
        
        int i = 0;
        int count = 0;
        int minWindow = Integer.MAX_VALUE;
        
        for(int j = 0 ; j < slen ; j++){
            
            if(--dict[s.charAt(j)] >= 0){
                count++;
            }
            
            while(count == tlen){
                int window = j - (i + 1);
                
                if(minWindow > window){
                    minWindow = window;
                    ans = s.substring(i,j + 1);
                }
                
                if(++dict[s.charAt(i)] > 0){
                    count--;
                }
                i++;
            }
            
        }
       return ans; 
    }
}

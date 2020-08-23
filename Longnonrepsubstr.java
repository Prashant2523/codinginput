class Solution {
public int lengthOfLongestSubstring(String str) {
Set set = new HashSet<>();
int b_pointer=0;
int a_pointer=0;
int max=0;
while(b_pointer< str.length()) {

	    		if(!set.contains(str.charAt(b_pointer))) {
	    			set.add(str.charAt(b_pointer));
	    			b_pointer++;
	    			max = Math.max(max, set.size());
	    		}
	    		
	    		else {
	    			set.remove(str.charAt(a_pointer));
	    			a_pointer++;
	    		}
	    	}
	    		
	    		return max;
	    		
	    	}
	    	
}

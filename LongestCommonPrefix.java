class Solution {
   
            public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)  return "";

        String maxStr = strs[0];
        String minStr = strs[0];
        
        for (String str : strs) {
            if (maxStr.compareTo(str) < 0) 
                maxStr = str;
            if (minStr.compareTo(str) > 0) 
                minStr = str;
        }
        
        if (minStr.length() == 0)
            return "";
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<minStr.length(); i++) {
            if (minStr.charAt(i) != maxStr.charAt(i)) {
                break;
            }
            sb.append(minStr.charAt(i));
        }
        return sb.toString();
    }
        
    }

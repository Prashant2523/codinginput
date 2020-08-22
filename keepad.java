class Solution {
    Map<Character,String> m ;
    List<String > ans ;
    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        if(digits.length()==0)
            return ans;
        m = new HashMap<>();
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
        m.put('5',"jkl");
        m.put('6',"mno");
        m.put('7',"pqrs");
        m.put('8',"tuv");
        m.put('9',"wxyz");
        
        
        backtrack(digits,0,new StringBuilder());
        return ans;
    }
    public void backtrack(String d,int cur , StringBuilder path)
    {
        if(cur ==d.length()) {
            ans.add(path.toString());
            return ;
        }
        for( int i = 0 ; i < m.get(d.charAt(cur)).length();i++)
        {
            path.append(m.get(d.charAt(cur)).charAt(i));
            backtrack(d,cur+1,path);
            path.deleteCharAt(path.length()-1);
        }
    }
}

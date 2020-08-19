class Subsequenceascii
{
	private static void subsequence(String s,String ans)
	{
		
		 if(s.length()==0) 
        { 
            System.out.println(ans);  
            return; 
        } 
  
                           
       subsequence(s.substring(1),ans+s.charAt(0)) ; 
  
        subsequence(s.substring(1),ans+(int)s.charAt(0)); 
              subsequence(s.substring(1),ans);
             
     
	}
	public static void main(String[] args) {
		Subsequence.subsequence("ab","");
	}
}

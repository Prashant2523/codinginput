class Mazepath
{
	public static void countpath(int dr, int dc, int sr, int sc,String sp)
	{
		if(sr==dr && sc==dc)
			System.out.println(sp);
		if(sr>dr || sc>dc) return ;
		 countpath(dr,dc,sr,sc+1,"hrm");
		
		 countpath(dr,dc,sr+1,sc,"vrm");
		 countpath(dr,dc,sr+1,sc+1,"Dm");
		

	}
	public static void main(String[] args) {
		Mazepath.countpath(2,2,0,0,"");
	}
}
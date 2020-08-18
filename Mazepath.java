class Mazepath
{
	public static void countpath(int dr, int dc, int sr, int sc,String sp)
	{
		if(sr==dr && sc==dc)
			System.out.println(sp);
		if(sr>dr || sc>dc) return ;
		 countpath(dr,dc,sr,sc+1,"hrm");
		//System.out.println(sr+","+sc+"hrm");
		 countpath(dr,dc,sr+1,sc,"vrm");
		 countpath(dr,dc,sr+1,sc+1,"Dm");
		//System.out.println(sr+","+sc+"vrmove");
		//int result= hr+vr;
		//System.out.println(sr+","+sc+"vrmove");
		//return result;
		//int vr= countpath(dr,dc,sr+1,sc);

	}
	public static void main(String[] args) {
		Mazepath.countpath(2,2,0,0,"");
	}
}
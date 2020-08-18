class Mazepath
{
	public static int countpath(int dr, int dc, int sr, int sc,String sp)
	{
		if(sr==dr && sc==dc) return 1;
			//System.out.println(sp);
		if(sr>dr || sc>dc) return ;
		 int hr=countpath(dr,dc,sr,sc+1,"hrm");
		//System.out.println(sr+","+sc+"hrm");
		int vr=countpath(dr,dc,sr+1,sc,"vrm");
		int dg= countpath(dr,dc,sr+1,sc+1,"Dm");
		//System.out.println(sr+","+sc+"vrmove");
		int result= hr+vr+dg;
		//System.out.println(sr+","+sc+"vrmove");
		return result;
		//int vr= countpath(dr,dc,sr+1,sc);

	}
	public static void main(String[] args) {
		System.out.print(Mazepath.countpath(2,2,0,0,""));
	}
}
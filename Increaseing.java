class Increasing
{
	private static void factorialof(int n)
	{
		if(n<1) return;
		 factorialof(n-1);
			System.out.println(n);
 
	
	}
	public static void main(String[] args) {
		Increasing.factorialof(5);
	}
}
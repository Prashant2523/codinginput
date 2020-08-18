class Factorial
{
	private static int factorialof(int n)
	{
		if(n==0)
			return 1;

		return n*factorialof(n-1);
	}
	public static void main(String[] args) {
		System.out.print(Factorial.factorialof(5));
	}
}
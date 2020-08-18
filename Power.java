import java.util.*;
class Power
{
	private static int powerof(int n, int b)
	{
		if (b != 0)
            return (n * powerof(n, b - 1));
        else
            return 1;
		
	}
	private static int powerfast(int n, int b)
	{
		if (b != 0)
		{
            int small= (n * powerof(n, b/2));
            if(b%2==0) return small;

              return (n*small);
		}
        else
            return 1;
		
	}

	public static void main(String[] args) {
		System.out.println(Power.powerof(5,2));
            Scanner s= new Scanner(System.in)
		System.out.print(Power.powerfast(6,6));

	}
}
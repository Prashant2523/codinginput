import java.util.*;
class Primeno1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				{ flag = true;
					System.out.println("not prime");
			        break;
		         }
		}
		if(flag==false)
		System.out.println("prime no");
	}
}
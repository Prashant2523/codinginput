import java.util.*;
class Armstrongno
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine();
		int n=s.length();
		int a=Integer.parseInt(s);
		int y=a,x,sum=0;
		for(int i=0;i<s.length();i++)
		{   x=a%10;
			sum=sum+ (int)Math.pow(x,n);
			a=a/10;
		}
		

		if(sum==y)
			{ System.out.print("no is armstong");}
		else
			{ System.out.print("no is Not armstong");}
	}
} 

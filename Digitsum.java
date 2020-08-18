import java.util.*;
class Digitsum
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		while(n>0){
			int x=n%10;
			sum=sum+x;
			n=n/10;
		}

		System.out.println(sum);
	}
}
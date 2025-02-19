import java.util.Scanner;
class Q129AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int n = new Scanner(System.in).nextInt();
		int temp = n ;
		int div = 1 ;
		while(temp>0)
		{
			div*=10;
			temp/=10;
		}
		if(n==((n*n)%div))
		{
			System.out.println("Atomorphic Number :"+n);
		}
		else
		{
			System.out.println("Not Atomorphic Number : "+n);
		}
	}
}

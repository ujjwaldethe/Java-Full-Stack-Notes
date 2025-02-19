import java.util.Scanner;
/*
An automorphic number is a number whose square ends with the same digits as the number itself.
Example:
5² = 25 ? Ends in 5 
76² = 5776 ? Ends in 76 
376² = 141376 ? Ends in 376 
*/
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

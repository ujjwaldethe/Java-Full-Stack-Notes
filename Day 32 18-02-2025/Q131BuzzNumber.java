import java.util.Scanner;
class Q131BuzzNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		if(num%7==0 || num%10==7)
		{
			System.out.println(num+" Is Buzz Number");
		}
		else
		{
			System.out.println(num+" Is Not A Buzz Number");
		}
	}
}

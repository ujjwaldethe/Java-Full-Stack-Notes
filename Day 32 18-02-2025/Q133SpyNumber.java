import java.util.Scanner;
class Q133SpyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int product = 1 , sum = 0 ,temp = num;
		while(num>0)
		{
			product*=num%10;
			sum+=num%10;
			num/=10;
		}
		if(product==sum)
			System.out.println(temp+" Is Spy Number ");
		else
			System.out.println(temp+" Is Not Spy Number ");
	}
}

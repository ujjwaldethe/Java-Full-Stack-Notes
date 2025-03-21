import java.util.Scanner;
class Q149PalindroneAndPrime 
{
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter A Number : ");
		for(int i = 0; i<1000;i++)
		{
			int ip = i;//sc.nextInt();
			int rev = reverse(ip);
			if(ip==rev&&isPrime(ip))
			{
				System.out.print(i+"  ");
			}
			//else
		//	/{
		//		System.out.println("It Is Not A Palindrone Prime");
		//	}
		}
	}
	public static int reverse(int ip)
	{
		int rev = 0;
		while(ip!=0)
		{
			rev=(rev*10)+(ip%10);
			ip/=10;
		}
		
		return rev;
	}
	public static boolean isPrime(int ip)
	{
		int den=2;
		while(den<ip)
		{
			if(ip%den==0)
				return false;
			den++;
		}
		return true;
	}
}

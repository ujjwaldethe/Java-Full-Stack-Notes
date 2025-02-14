import java.util.Scanner;
class Q86Danger
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number ");
		int range = new Scanner(System.in).nextInt();
		int res = 0 ,fact = 1;
		int temp = range;
		int count = 0;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		temp = range;
		while(temp>0)
		{
			int rem = temp%10;
			for(int i = 1 ; i<=count;i++)
			{
				fact = 1;
				for(int j= 1 ; j<=rem ; j++)
				{
					fact*=j;
				}
				res +=fact;
				}
		}
		System.out.print(res+" ");

		
	}
}

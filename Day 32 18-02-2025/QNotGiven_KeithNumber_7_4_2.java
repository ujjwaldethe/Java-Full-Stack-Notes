import java.util.Scanner;
class QNotGiven_KeithNumber_7_4_2
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int n = new Scanner(System.in).nextInt();
		
		int a = 7 , b = 4 , c = 2 ,flag=0;
		int sum = 0;
		while(sum<=n)
		{
			sum = a + b + c ;
			a = b ;
			b = c ;
			c = sum ;
			if(sum==n)
			{
				flag=1;
				break;
			}
		}
		System.out.println((flag==1)?("Keith Number : "+n):("Not A Keith Number : "+n));

	}
}
//buzz number //divied by 7 or last digit contains 7
//duck number
//sunny number //  .
//spy number // sum of digit and product of digits eqaul then spy else not a spy number
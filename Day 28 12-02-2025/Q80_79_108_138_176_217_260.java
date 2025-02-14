import java.util.Scanner;
class Q80_79_108_138_176_217_260
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Range : ");
		int range = new Scanner(System.in).nextInt();
		int res = 79;
		int prime = 29 ;
		boolean flag = true;
		
		for(int i=0 ; i < range ; i++)
		{

			for(int j = 2 ; j<(prime/2); j++ )
			{
				flag=true;
				if(prime%j==0)
				{
					flag=false;
					j=1;
					prime++;
				}
			}
			if(flag)
			{
				System.out.println(res);
				res+=prime;
				prime++;
			}
			
		}
	}
}

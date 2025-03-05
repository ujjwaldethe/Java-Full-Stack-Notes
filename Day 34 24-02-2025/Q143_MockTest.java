import java.util.Scanner;
class Q143_MockTest
{
	public static void main(String[] args) 
	{
			int n = 10,t=0,a=5,b=5;
			for(int i = 1 ; i <=(n/2);i++)
			{
				for(int j = 0 ;  j<(n-t); j++)
				{
					if(j<((n-t)/2))
					{
						System.out.print(a+"*");
						a--;
					}
					if(j>=((n-t)/2))
					{
						System.out.print(b+"*");
						b--;
					}
				}
				System.out.println();
				a=5-i;
				b=5-i;
				t=t+2;
			}
					
	}
}
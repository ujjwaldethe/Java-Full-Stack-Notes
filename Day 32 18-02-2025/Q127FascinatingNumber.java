import java.util.Scanner;
class Q127FascinatingNumber //one digits must be one times
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Number : ");
		int n = sc.nextInt();
		int temp = n ; 
		int count = 0,num = 0,res=0,len=1,copy=0;
		while(temp>0)
		{
			count++;
			temp/=10;
			len*=10;
		}
		for(int i = 1; i <= count ; i++)
		{	
			num *= len;
			num +=n*i;
		}
		x:
		for(int i = 0 ; i <= 9 ; i++)
		{
			count=0;
			copy = num;
			while(copy>0)
			{
				if(i==(copy%10))
					count++;
				if(count>1)
					break x;
				copy/=10;
			}
		}
		if(count>1)
		{
			System.out.println("\nNot Fascinating Number "+num);
		}
		else
		{
			System.out.println("\nFascinating Number "+num);
		}
	}
}

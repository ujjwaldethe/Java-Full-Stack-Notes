import java.util.Scanner;
class Q76GoodPrime
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int count = 0;
		for(int i=2;i<=num;i++) 
		{
			
			boolean flag = true;
			for(int j=2 ; j<i ; j++)
			{
				if(i%j==0)
				{
					flag=false;
					continue;
				}
			}
			if(flag)
			{	
				int temp = i;
				System.out.println("prime : "+temp);
				while(temp>0)
				{
					flag=true;
					int rem = temp%10;
					if(rem!=2&&rem!=3&&rem!=5&&rem!=7)
					{
						flag=false;
						break;
					}
					temp/=10;
				}
				if(flag)
				{
					System.out.println("Good Prime : "+i);
					count++;		
				}
			}
		}
		System.out.println("Good Prime Count : "+count);
	}
}

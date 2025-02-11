import java.util.Scanner;
class Q71MakeNumberPrime 
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Number : ");
		int num = sc.nextInt();
		if(num==1)
			num++;
		for(int i = 2 ; i<num ; i++)
		{

			flag = false;
			if(num%i==0)
			{
				flag=true;
			}
			if(flag)
			{
				i = 2;
				num++;
			}
		}
		System.out.println("Prime Number : "+num);
	}
}

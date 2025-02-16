import java.util.Scanner;
class Q89TechNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int temp = num;
		int count = 0;
		int div = 1;
		while(temp>0)
		{
			count++;			
			temp/=10;
		}
		if(count%2==0)
		{
			count = count/2;
			while(count>0)
			{
				div*=10;
				count--;
			}
			if(num==(((num/div)+(num%div))*((num/div)+(num%div))))
			{
				System.out.println("This Number Is Tech Number: "+num);
			}
		}
		else
		{
			System.out.println("This Number Is Not Tech Number");
		}
	}
}
//2025

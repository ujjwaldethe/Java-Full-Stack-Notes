import java.util.Scanner;
class Q84ArmStrong 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int temp = num;
		int count = 0;
		int powRes = 1;
		int res = 0;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		temp = num;
		while(temp>0)
		{
			int rem = temp%10;
			powRes=1;
			for(int i=1 ;i <=count;i++)
			{
					powRes*=rem; 
			}
			temp/=10;
			res+=powRes;
		}
		if(num==res)	
			System.out.println("ArmStrong : "+res);
		else
			System.out.println("Not ArmStrong");
		}
	
}

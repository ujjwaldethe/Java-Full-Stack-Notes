public class Q151RangeOfArmStrong 
{
	public static void main(String[] args) 
	{
		for(int start=2; start<1000 ; start++)
		{	
			if(isArmstrong(start))	
			{
				System.out.print(start+" ");
			}
		}
	}
	public static boolean isArmstrong(int num)
	{
		int sum = 0;
		int temp = num;
		int count = count(num);
		while(num!=0)
		{
			sum+=power(num%10,count);
			num/=10;
		}
		return temp==sum;
	}
	public static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	public static int power(int base,int raise)
	{
		int pow = 1 ; 
		for(int i = 1;i<=raise;i++)
		{
			pow *=base;
		}
		return pow;
	}
}

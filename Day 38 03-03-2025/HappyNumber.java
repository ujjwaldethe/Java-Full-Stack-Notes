class HappyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(isHappy(1000));
	}
	public static boolean isHappy(int num)
	{
		int sum = sumOfSqOfDigits(num);
		while(sum!=4 && sum!=1)
		{
			sum = sumOfSqOfDigits(sum);
		
		}
		return (sum==1)?true:false;
	}
	public static int sumOfSqOfDigits(int num)
	{
		int sum = 0; 
		while(num>0)
		{
			sum+=(num%10)*(num%10);
			num/=10;
		}
		return sum;
	}	
}

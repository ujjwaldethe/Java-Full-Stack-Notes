class Q150RangeOfPrime 
{
	public static void main(String[] args) 
	{
		for(int start=2; start<1000 ; start++)
		{	
			if(isPrime(start))	
			{
				System.out.print(start+" ");
			}
		}
	}
	public static boolean isPrime(int num)
	{
		int den = 2 ; 
		while(den<Math.sqrt(num))
		{
			if(num%den==0)
				return false;
			den++;
		}
		return true;
	}
}

class Q161RecursivePrime 
{
	public static void main(String[] args) 
	{
		System.out.println(isPrime(2,6));
	}
	public static boolean isPrime(int den,int num)
	{
		if(den==num)
		{
			return true;
		}
		else if(num%den==0)
		{
			return false;
		}
		return isPrime(++den,num);
	}
}

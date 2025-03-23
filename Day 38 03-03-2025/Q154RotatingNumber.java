class Q154RotatingNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(isRotatingPrime(11));
	}
	public static boolean isRotatingPrime(int num)
	{
		if(isPrime(num))
		{
			
			int rot = rotate(num);
			while(rot!=num && isPrime(rot))
			{
				rot = rotate(rot);
			}
			return num==rot;
		}
		return false;
	}
	public static int rotate(int num)
	{
		int count = 1;
		for(int i=num;i>=10;i/=10)
		{
			count*=10;			
		}
		return (((num%10)*count)+num/10);
	}
	public static boolean isPrime(int num)
	{
		int den = 2 ;
		while(den<(num/2))
		{
			if(num%den==0)
				return false;
			den++;
		}
		return true;
	}
}

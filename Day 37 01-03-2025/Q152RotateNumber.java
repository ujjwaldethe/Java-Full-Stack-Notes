class Q152RotateNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(rotate(1234));
	}
	public static int rotate(int num)
	{ 
		//U need to compile both Q151RangeOfArmStrong and Q152RotateNumber Programms
		return (num%10)*Q151RangeOfArmStrong.power(10,(Q151RangeOfArmStrong.count(num)-1))+(num/10);
	}
}

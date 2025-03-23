class Q153RotateAllPossibleRotationOfNumber 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int rot = rotate(num);
		while(num!=rot)
		{
			System.out.println(rot);
			rot=rotate(rot);	
		}
		System.out.println(rot);
	}
	public static int rotate(int num)
	{
		//U need to compile both Q151RangeOfArmStrong and Q152RotateNumber Programms
		return (num%10)*Q151RangeOfArmStrong.power(10,(Q151RangeOfArmStrong.count(num)-1))+(num/10);
	}
}

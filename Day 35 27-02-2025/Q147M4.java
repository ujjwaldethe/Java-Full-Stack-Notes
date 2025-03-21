class Q147M4 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		add('a',19);
		division(100.0,50.0);	
	}
	public static void add(int num1 , int num2)
	{
		System.out.println("Add Start");
		int res = num1 + num2 ;
		System.out.println(res);
		System.out.println("Add End");
	}
	public static void division(double num , double den)
	{
		System.out.println("Division Start");
		double res = num/den;
		System.out.println(res);
		System.out.println("Division End");
	}

}

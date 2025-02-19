import java.util.Scanner;
/*
A Duck Number is a positive number that contains at least one '0' in it, but the zero should not be at the beginning.

Examples:
3210 ? Contains 0 (Duck Number ?)
705 ? Contains 0 (Duck Number ?)
089 ? Starts with 0 (Not a Duck Number ?)
123 ? No 0 (Not a Duck Number ?)
*/
class Q132DuckNumber
{


	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		String num = new Scanner(System.in).next();
		num = num.replaceAll("[^0-9]","");
		if(num.charAt(0)=='0')
			System.out.println("Not A DUCK NUM ");
		else
		{
			if(num.contains("0"))
				System.out.println("DUCK NUM ");
			else
				System.out.println("Not A DUCK NUM ");
		}
	}
}

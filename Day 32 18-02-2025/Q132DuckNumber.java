import java.util.Scanner;
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

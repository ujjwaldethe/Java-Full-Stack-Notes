import java.util.Scanner;
class Q35LeapYearConceptClass
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter A Year : ");
		int year = new Scanner(System.in).nextInt();
		if(year%4==0 && (year%100!=0 || year%400==0))
		{
			System.out.print(year+" Is Leap Year");
		}
		else
		{
			System.out.print(year+" Is Not A Leap Year");
		}
	}
}

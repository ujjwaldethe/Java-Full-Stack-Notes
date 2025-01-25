import java.util.Scanner;
class Q30CalculatorEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter First Number : ");
		float num1 = sc.nextFloat();
		System.out.print("\nEnter Second Number : ");
		float num2 = sc.nextFloat();
		System.out.print("\nEnter Operator : ");
		char ch = sc.next().charAt(0);
		float opt = 0f;
		System.out.println(
			 (ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')?
			 ((ch=='+')?("\n"+num1+" "+ch+" "+num2+" = "+(opt=num1+num2)):
			 (ch=='-')?("\n"+num1+" "+ch+" "+num2+" = "+(opt=num1-num2)):
			 (ch=='*')?("\n"+num1+" "+ch+" "+num2+" = "+(opt=num1*num2)):
			 (ch=='/')?("\n"+num1+" "+ch+" "+num2+" = "+(opt=num1/num2)):                                                              
			 ("\n"+num1+" "+ch+" "+num2+" = "+(opt=num1%num2))):("\nWrong Operator")
			);
		
	}
}

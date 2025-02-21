import java.util.Scanner;
class Q136_2_Q136DecimalToBinaryUsingString
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		String res = "";
		int count=1;
		while(num>0)
		{
			res = (num%2)+res;
			num/=2;
		}
		System.out.println(res);
	}
}

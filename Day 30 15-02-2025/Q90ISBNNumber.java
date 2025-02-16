import java.util.Scanner;
class Q90ISBNNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number: ");
		long num = new Scanner(System.in).nextLong();
		long temp = num;
		long res = 0;
		int i = 1;
		while(temp>0)
		{
			res = res + temp%10*i;
			System.out.println(temp%10+"*"+i+" : "+temp%10*i);
			temp/=10;
			i++;
		}
		if(res%11==0)
			System.out.println("Valid ISBN Number : "+res);
		else
			System.out.println("Not A Valid ISBN Number "+res);
	}
}

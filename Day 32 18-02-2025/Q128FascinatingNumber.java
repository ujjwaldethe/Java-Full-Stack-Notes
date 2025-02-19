import java.util.Scanner;
class Q128FascinatingNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		String str = num+""+(num*2)+""+(num*3);
		int count = 0 ;
		x:
		for(char i='1' ; i<='9';i++)
		{
			count=0;
			for(int j =0 ; j<str.length();j++)
			{
				if(str.charAt(j)=='0')
					break x;
				if(i==str.charAt(j))
					count++;
			}
			if(count!=1)
				break;
		}
		System.out.println((count!=1)?(str+ " Is Fascinating Number "):(str+ "Is Not A Fascinating Number "));
	}
}

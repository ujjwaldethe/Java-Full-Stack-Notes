import java.util.Scanner;
class Sample 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String : ");
		String name = new Scanner(System.in).next();
		int res = 0;
		int count = 0;
		for(int i = 0 ; i <27;i++)
		{
			char ch = name.charAt(i);
			count++;

		}
		System.out.println(res);
	}
}

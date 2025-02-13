import java.util.Scanner;
class Q79_10_30_68_130_222
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Range : ");
		int range = new Scanner(System.in).nextInt();
		for(int i =  2 ; i < (range+2) ; i++)
		{
			System.out.print((i*i*i)+i+" ");	
		}
	}
}

import java.util.Scanner;
class Q134SunnyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		num++;
		int sqrt = 0,flag=0;
		for(int i = 1 ; i <= (num/2) ; i++)
		{
			if((i*i)>num)
				break;
			if((i*i)==num)
			{
				sqrt = i ;
				flag=1;
				break;
			}
		}
		System.out.println((flag==1)?("Sunny Number : "+(--num)):("Not A Sunny Number"));
	}
}

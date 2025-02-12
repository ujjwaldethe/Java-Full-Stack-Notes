import java.util.Scanner;
class Q77_144_2197_197_3375_256 
{
	public static void main(String[] args) 
	{
		int num = 12 ;
		System.out.print("Enter Range : ");
		int n = new Scanner(System.in).nextInt();
		int res ;
		for(int i = 1; i <= n ; i++)
		{
			res = (num%2==0)?num*num:num*num*num;
			num++;
			System.out.print(res+" ");
			
		}
	}
}
// 144 2197 197 3375 256

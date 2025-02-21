/*
A Keith number (or repfigit number) is a special number that appears in a Fibonacci-like sequence generated using its own digits.

Definition:
A number N with d digits is a Keith number if:

Start with the digits of N as the initial terms of a sequence.
Each subsequent term is the sum of the previous d terms.
If N itself appears in this sequence, it is a Keith number.
Example 1: 197
197 has 3 digits ? Start sequence: 1, 9, 7
Next numbers in sequence:
1 + 9 + 7 = 17
9 + 7 + 17 = 33
7 + 17 + 33 = 57
17 + 33 + 57 = 107
33 + 57 + 107 = 197 (matches the original number)
? 197 is a Keith number

Other Keith Numbers (Base 10)
14, 19, 28, 47, 61, 75, 197, 742, 1104, 1537, ...
*/

import java.util.*;
class Q135Keith_Number_7_4_2
{
	public static void main(String[] args) 
	{
			System.out.println("Enter Number : ");
			int n = new Scanner(System.in).nextInt();
			int temp = n ,len=0,sum=0,dup=n;
			boolean flag = false; 
			int[] arr ; 
			while(temp>0)
			{
				len++;
				temp/=10;
			}
			arr = new int[len];
			System.out.println(arr.length);
			for(int i = arr.length-1 ; i>= 0 ; i--)
			{
				arr[i]=n%10;
				n/=10;	
			}
			while(sum<=dup)
			{
				sum=0;
				for(int i = 0; i<arr.length;i++)
				{
					sum+=arr[i];	
				}
				for(int i = 1; i<arr.length;i++)
				{
					arr[i-1]=arr[i];
				}
				arr[len-1]=sum;
				if(dup==sum){
					flag=true;
					break;
				}
			}
			System.out.println((flag)?("Keith Number : "+dup):("Not A Keith Number : "+dup));
	}
}

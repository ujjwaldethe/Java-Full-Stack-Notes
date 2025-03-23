class Q163RecursivePalindrone 
{
	public static void main(String[] args) 
	{
		System.out.println(reverse(121,121,0));
	}
	public static boolean reverse(int num,int temp,int rev)
	{
		
		if(num==0)
		{
			return rev==temp;	
		}
		rev=rev*10+(num%10);
		return reverse(num/10,temp,rev);
	}
}

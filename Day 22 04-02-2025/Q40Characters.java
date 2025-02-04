class Q40Characters 
{
	public static void main(String[] args) 
	{
		int a = 0;
		for(char i = 'A' ; i<='Z'; i+=a)
		{
			System.out.print((char)(i+a)+" ");
			a++;
		}
	}
}

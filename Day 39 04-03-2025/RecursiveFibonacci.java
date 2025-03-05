class RecursiveFibonacci
{
	public static void main(String[] args) 
	{
		fibbo(10,0,1);
	}
	public static void fibbo(int num,int n1,int n2)
	{
		if(num>0)
		{
			System.out.print(n1+" ");
			fibbo(--num,n2,(n1+n2));
		}
	}
}



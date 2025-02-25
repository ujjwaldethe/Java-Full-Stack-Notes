class Q144_BreakLabel 
{
	public static void main(String[] args) 
	{
		outerLoop:
		for(int i=0; i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==2)
					break outerLoop;
				System.out.println(i+":"+j);
			}
		}

	}
}

class Q106To116Patterns 
{
	public static void main(String[] args) 
	{
		
		for(int i = 0 ;i <5 ; i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0 || i==4 || i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		/*
		o/p: 
		*
		* *
		*   *
		*     *
		* * * * *

		*/
		for(int i = 0 ;i <5 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==4 || i==4 || i+j==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
					
			}
			System.out.println();
		}
		System.out.println();
		/*
		o/p:
		        *
		      * *
		    *   *
		  *     *
		* * * * *
		*/

		for(int i = 1 ;i <=5 ; i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || j==1 ||i+j==6)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		/*
		o/p:

		* * * * *
		*     *
		*   *
		* *
		*
		*/

		for(int i = 0 ;i <=5 ; i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(i==0 || j==5  || i==j)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	
		/*
		o/p:

		* * * * * *
		  *       *
		    *     *
		      *   *
		        * *
		          *
		*/
		
		for(int i = 0 ;i <5 ; i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0 ||  i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i = 1 ;i <5 ; i++)
		{
			for(int j=2;j<=5;j++)
			{
				if( j==2 ||i+j==6)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		/*
		o/p:

		*
		* *
		*   *
		*     *
		*       *
		*     *
		*   *
		* *
		*
			
		*/
		System.out.println();
		for(int i = 0 ;i <4 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==4 ||  i+j==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
					
			}
			System.out.println();
		}
		for(int i = 0 ;i <5 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==5  || i==j || j==4)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			System.out.println();
	
		}
		System.out.println();
	
		 /*

		        *
		      * *
		    *   *
		  *     *
		*       *
		  *     *
		    *   *
		      * *
		        *
		 
		 */

		for(int i = 0 ;i <5 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i+j==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
					
			}
			for(int j=1;j<=i;j++)
			{
				if(i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i = 1 ;i <5 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if( i==j )
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			for(int j=2;j<=5;j++)
			{
				if(i+j==5)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		/*
		o/p:
		        *
		      *   *
		    *       *
		  *           *
		*               *
		  *           *
		    *       *
		      *   *
		        *

		*/
		System.out.println();
		System.out.println();

		for(int i = 0 ;i <5 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i+j==4 || i==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
					
			}
			for(int j=1;j<=i;j++)
			{
				if(i==j || i==4)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		/*
		o/p:
		          *
		        *   *
		      *       *
		    *           *
		  *               *
		*   *   *   *   *   *
		
		
		*/
		System.out.println();
		System.out.println();
		for(int i = 1 ;i <=5 ; i++)
		{
			for(int j=1;j<=5;j++)
			{
				if( j==i || i==1 )
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			for(int j=2;j<=5;j++)
			{
				if(i+j==6 || i==1)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		/*

		* * * * * * * * *
		  *           *
		    *       *
		      *   *
		        *

		*/
	}
}

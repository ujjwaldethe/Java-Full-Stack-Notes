class Q94To105Pattern 
{
	public static void main(String[] args) 
	{
		for(int i = 0 ;i <5 ; i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		/*
		o/p: 
		*
		* *
		* * *
		* * * *
		* * * * *

		*/
		for(int i = 0 ;i <5 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j>=4-i)
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
	    * * *
	  * * * *
	* * * * *
		*/

		for(int i = 1 ;i <=5 ; i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=1 && i+j<=6)
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
		* * * *
		* * *
		* *
		*
		*/

		for(int i = 0 ;i <=5 ; i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(j>=i && j<=5)
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
		  * * * * *
		    * * * *
			  * * *
				* *
		   		  *
		*/
		
		for(int i = 0 ;i <5 ; i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1 ;i <=5 ; i++)
		{
			for(int j=2;j<=5;j++)
			{
				if(j>=1 && i+j<=6)
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
		* * *
		* * * *
		* * * * *
		* * * *
		* * *
		* *
		*
		
		*/
		System.out.println();
		for(int i = 0 ;i <4 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j>=4-i)
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
				if(j>=i && j<=5)
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
		     * * *
		   * * * *
		 * * * * *
		   * * * *
		     * * *
		       * *
		         *

		 
		 */

		for(int i = 0 ;i <5 ; i++)
		{
			 for(int j=0;j<5;j++)
			{
				if(j>=4-i)
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
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1 ;i <5 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j>=i && j<=5)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			for(int j=1;j<5;j++)
			{
				if(j>=1 && i+j<=4)
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
		      * * *
		    * * * * *
		  * * * * * * *
		* * * * * * * * *
		  * * * * * * *
		    * * * * *
		      * * *
		        *
		*/
		System.out.println();

		for(int i = 0 ;i <=5 ; i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(j>=5-i)
				{
					System.out.print("*   ");
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
		        *   *
		      *   *   *
		    *   *   *   *
		  *   *   *   *   *
		*   *   *   *   *   *
		
		
		*/
		for(int i = 0 ;i <=5 ; i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(j>=i && j<=5)
				{
					System.out.print("*   ");
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
			*   *   *   *   *   *
			  *   *   *   *   *
			    *   *   *   *
			      *   *   *
			        *   *
			          *

		*/
	}
}
/*
for(int i = 1 ; i<6;i++)
		{
			for(int j = 1 ; j<5 ;j++)
			{
				if(j>6-i)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			for(int j = 1 ; j<6 ;j++)
			{
				if(j>=i || i==5 && j==1)
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
		for(int i = 2 ; i<6;i++)
		{
			for(int j = 1 ; j<6 ;j++)
			{
				if(j<=i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j = 1 ; j<5 ;j++)
			{
				if(5-i>j)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
o/p:
* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*       *       *
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * *

*/
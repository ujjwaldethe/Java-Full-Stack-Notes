import java.util.Scanner;
class Pattern 
{
	public static void main(String[] args) 
	{

		for(int i = 0 ; i <=5 ; i++ )
        {
            
            for(int j =0 ; j<=i ; j++)
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
		* * * * * *
		*/
		for(int i = 1 ; i <5 ; i++ )
        {
            
            for(int j =1 ; j<=i ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }	
		/*
		
		1
		1 2
		1 2 3
		1 2 3 4
		*/
		System.out.println();
		int a=1;
		for(int i = 1 ; i <5 ; i++ )
        {
            for(int j =1 ; j<=i ; j++)
            {
                System.out.print(a+" ");
				a++;
            }
            System.out.println();
        }
		System.out.println();
		/*
		1
		2 3
		4 5 6
		7 8 9 10

		*/
		
		char c ='a' ;
        for(int i = 1 ; i <5 ; i++ )
        {
			c='a';
            for(int j =1 ; j<=i ; j++)
            {	
				if(j%2==0)
				{
					System.out.print(c+" ");
				}
				else
				{
					System.out.print(c+" ");
				}
				c++;
            }		
			
            System.out.println();
        }	
		System.out.println();

		/*
		a
		a b
		a b c
		a b c d
		*/
		 c ='a' ;
        for(int i = 1 ; i <5 ; i++ )
        {
            for(int j =1 ; j<=i ; j++)
            {	
				if(j%2==0)
				{
					System.out.print(c+" ");
					c++;
				}
				else
				{
					System.out.print(c+" ");
					c++;
				}
            }
            System.out.println();
        }	
		System.out.println();
		/*
		a
		b c
		d e f
		g h i j

		*/
		for(int i = 1 ; i <5 ; i++ )
        {
            for(int j =1 ; j<=i ; j++)
            {	
				if((i+j)%2==0)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
            }
            System.out.println();
        }		

		/*
		1
		0 1
		1 0 1
		0 1 0 1
		
		*/
		System.out.println();
		
		a = 2;
		for(int i = 1 ; i <5 ; i++ )
        {
            for(int j =1 ; j<=i ; j++)
            {	
				System.out.print(a+" ");
				a=a+2;
            }
            System.out.println();
        }
		
		System.out.println();

		/*
		2
		4 6
		8 10 12
		14 16 18 20
		
		*/

		a = 1;
		for(int i = 1 ; i <5 ; i++ )
        {
            for(int j =1 ; j<=i ; j++)
            {	
				System.out.print(a+" ");
				a=a+2;
            }
            System.out.println();
        }
		
		System.out.println();

		/*
		1
		3 5
		7 9 11
		13 15 17 19

		*/

		
		System.out.println();
		
		
		a = 1 ;
		char b ='a';
        for(int i = 1 ; i <=5 ; i++ )
        {
            for(int j =1 ; j<=i ; j++)
            {	
				if(i%2!=0)
				{
					System.out.print(b+" ");
					b++;
				}
				else
				{
					System.out.print(a+" ");
					a++;
				}
            }
            System.out.println();
        }	
		System.out.println();
		/*
		a
		1 2
		b c d
		3 4 5 6
		e f g h i		
		*/
       
    }
}
/*






















for(int j =0 ; j<=10 ; j++)
            {
                if(j>=5-i && j<=5+i && i<=4)
                {
                    System.out.print("*");
                }
                else if(j>i-4 && j < 14 - i && i >= 5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }



 for(int i = 0 ; i <5; i++ )
        {
            
			for(int j =0 ; j<4 ; j++)
            {
                if(j==4-i || j==4+i ) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
            }
            for(int j =0 ; j<=4 ; j++)
            {
					if(j==i || j==0 && i==4)
						System.out.print("*");
					else
						System.out.print(" ");
			}
			
            System.out.println();
        }
		for(int i = 1 ; i <5; i++ )
        {
		 for(int j =0 ; j<5 ; j++)
            {
                if(j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
            }
			for(int j =1 ; j<4 ; j++)
            {
				if(i+j==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
            System.out.println();
        }
		/*
		    *
		   * *
		  *   *
		 *     *
		*   *   *
		 *     *
		  *   *
		   * *
		    *
		
		
		System.out.println();
		 for(int i = 0 ; i <5; i++ )
        {
            
			for(int j =0 ; j<4 ; j++)
            {
                if(j>=4-i && j<4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
            }
            for(int j =0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
			
            System.out.println();
        }
		for(int i = 1 ; i <5; i++ )
        {
         
		 for(int j =0 ; j<5 ; j++)
            {
                if(j>=i && j<5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
            }
			for(int j =4-i ; j>0 ; j--)
            {
                System.out.print("*");
            }
			
            System.out.println();
        }
		System.out.println();
	/*
		    *
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    *	
	*

	for(int i = 0 ; i <5; i++ )
        {
            
            for(int j =0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
			
            System.out.println();
        }
		System.out.println();
		for(int i = 0 ; i <5; i++ )
        {
         
			for(int j =5-i ; j>0 ; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
		for(int i = 0 ; i <5; i++ )
        {
			for(int j =0 ; j<=5 ; j++)
            {
                if(j>=4-i && j<5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
            }
            System.out.println();
        }
		System.out.println();
		for(int i = 0 ; i <5; i++ )
        {
			for(int j =0 ; j<5 ; j++)
            {
                if(j>=i && j<5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
            }
            System.out.println();
        }


int n = new Scanner(System.in).nextInt();
		if(n%2!=0)
			n--;
        for(int i = 0 ; i <=n; i++ )
        {
            
            for(int j =0 ; j<=n ; j++)
            {
                if(j>=(n/2)-i && j<=(n/2)+i && i<=(n/2)-1)
                {
                    System.out.print("*");
                }
                else if(j>i-((n/2)-1) && j < (n)+(n/2-1) - i && i >= (n/2))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


*/
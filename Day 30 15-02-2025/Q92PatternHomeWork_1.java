class Q92PatternHomeWork_1 {
    public static void main(String[] args) {
       
		int odd= 9,even=-2,prev=0;
        for (int i = 1; i <=5; i++) {
			System.out.print(i+" ");
			prev = i ;
            for (int j = 2; j <= i; j++) {
				
				if(j%2==0)
				{
					prev = prev+odd;
					System.out.print(prev+" ");
					
				}
				else if(j%2!=0 && j<5) 
				{
					prev = prev + even;	
					System.out.print(prev+" ");
				}
				else
				{
					System.out.print((prev+(j/2))+" ");
				}
			}
            System.out.println(); 
			odd-=2;
			even+=2;
			
        }
    }
}
/*
1 
2 9 
3 8 10 
4 7 11 14
5 6 12 13 15
*/
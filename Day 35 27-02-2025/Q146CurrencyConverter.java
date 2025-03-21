import java.util.Scanner;
class Q146CurrencyConverter 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		System.out.print("Enter The Rupee : ");
		Scanner sc = new Scanner(System.in);
		double rupee = sc.nextDouble();
		rupeeToDollar(rupee);
		System.out.println("Main End");
	}
	public static void rupeeToDollar(double rupee)
	{
		System.out.println("Rupee To Dollar Start");
		double dollar = rupee/87.5;
		System.out.println("Rupees : "+rupee+" \nDollar : "+dollar);
		dollarToEuro(dollar);
		System.out.println("Rupee To Dollar End");
	}
	public static void dollarToEuro(double dollar)
	{
		System.out.println("Dollar To Euro Start");
		double euro = dollar*0.95;
		System.out.println("Dollar : "+dollar+" \nEuro : "+euro);
		euroToDiahrams(euro);	
		System.out.println("Dollar To Euro End");
	}
	public static void euroToDiahrams(double euro)
	{
		System.out.println("Euro To Diahrams Start");
		double diahrams = euro * 3.85;
		System.out.println("Euro : "+euro+" \nDiahrams : "+diahrams);
		System.out.println("Euro To Diahrams End");
	}
}

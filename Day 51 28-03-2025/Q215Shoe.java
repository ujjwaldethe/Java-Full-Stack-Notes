import java.util.Scanner;
class Q215Shoe 
{
	String brand = "Neebok";
	double price;
	String color;
	String type;
	{ 
		System.out.println("Object Loading");
		brand = new Scanner(System.in).next();
		if(brand.charAt(0)=='N')
		{
			price=1000.0;
		}
		else
		{
			price=500.0;
		}
	}
	public void displayShoe()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Color : "+color);
		System.out.println("Type : "+type);
	}
}

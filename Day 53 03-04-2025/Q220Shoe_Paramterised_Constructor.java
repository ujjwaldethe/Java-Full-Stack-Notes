class Q220Shoe_Paramterised_Constructor
{
	String brand = "Reebok";
	double price;
	int size;
	String color;
	String type;
	{
		System.out.println("Non Static Block Starts");
		displayShoe();
		if(brand.charAt(0)=='R')
		{
			price = 1000.0;
		}
		else
		{
			price = 500.0;
		}
		displayShoe();
		System.out.println("Non Static Block Ends");
	}
	public void displayShoe()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Size : "+size);
		System.out.println("Color : "+color);
		System.out.println("Type : "+type);
	}
}

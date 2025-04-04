class Q212AirConditioner 
{
	String brand;
	double price;
	double ton;
	int maxTemp;
	int minTemp;
	int ambTemp;
	public void details()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Ton : "+ton);
	}
	public void displayMaximum()
	{
		System.out.println("Maximum Temperatur : "+maxTemp);
	}
	public void displayMinimum()
	{
		System.out.println("Minimum Temperatur : "+minTemp);
	}
	public void displayAmbient()
	{
		System.out.println("Maximum Temperatur : "+maxTemp);
	}
}

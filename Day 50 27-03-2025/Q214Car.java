class Q214Car  
{	
	String brand;
	String model;
	int cc;
	int price;
	public void displayCar()
	{
		String brand= "Kidnapping Car";
		System.out.println("Local Brand : "+brand);
		System.out.println("Global Brand : "+this.brand);
		System.out.println("Model : "+model);
		System.out.println("CC : "+cc);
	}

}

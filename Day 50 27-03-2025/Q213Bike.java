class Q213Bike 
{
	String brand;
	String model;
	int mileage;	
	int cc;
	public void displayBike()
	{
		String brand= "Chapri Bike";
		System.out.println("Local Brand : "+brand);
		System.out.println("Global Brand : "+this.brand);
		System.out.println("Model : "+model);
		System.out.println("Mileage : "+mileage);
		System.out.println("CC : "+cc);
	}
}

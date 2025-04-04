class Q212AirConditionerDriver 
{
	public static void main(String[] args) 
	{
		Q212AirConditioner bluestar = new Q212AirConditioner();
		bluestar.brand="Blue Star";
		bluestar.price=150000.0;
		bluestar.ton=1.5;
		bluestar.maxTemp=28;
		bluestar.minTemp=16;
		bluestar.ambTemp=18;

		bluestar.details();
		bluestar.displayMinimum();
		bluestar.displayMaximum();
		bluestar.displayAmbient();

	}
}

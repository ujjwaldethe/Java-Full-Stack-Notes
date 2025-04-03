class Q216MangoMethodChaining 
{
	double price;
	String type;
	String origin;
	public Q216MangoMethodChaining displayPrice()
	{
		System.out.println("Price : "+price);
		return this;
	}
	public Q216MangoMethodChaining displayType()
	{
		System.out.println("Type : "+type);
		return this;
	}
	public Q216MangoMethodChaining displayOrigin()
	{
		System.out.println("Origin : "+origin);
		return this;
	}

}

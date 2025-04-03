class Q218StudentConstructor
{
	String name;
	int age;
	String coll;
	String degree;
	int roll;
	Q218StudentConstructor()
	{
		System.out.println("From No Args Constructor");
		System.out.println(this);
	}
	public void displayStudent()
	{
		String name = "Mighty Raju";
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Collage : "+coll);
		System.out.println("Degree :"+degree);
		System.out.println("Roll No : "+roll);
	}
}

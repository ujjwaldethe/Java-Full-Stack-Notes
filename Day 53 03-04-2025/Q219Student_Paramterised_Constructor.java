class Q219Student_Paramterised_Constructor
{
	String name;
	int age;
	String coll;
	String degree;
	int roll;
	Q219Student_Paramterised_Constructor()
	{
		System.out.println("From No Args Constructor");
		System.out.println(this);
	}
	Q219Student_Paramterised_Constructor(String name,int age,String coll,String degree,int roll)
	{	
		this.name=name;
		this.age=age;	
		this.coll=coll;
		this.degree=degree;
		this.roll=roll;
	}
	public void displayStudent()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll : "+roll);
		System.out.println("Collage : "+coll);
		System.out.println("Degree : "+degree);
	}
}

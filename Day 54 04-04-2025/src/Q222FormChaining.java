class Q222FormChaining
{
	String name ;
	long phno ;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;
	Q222FormChaining()
	{
		System.out.println("No Args Constructor Called Using this()");
	}
	Q222FormChaining(String name,long phno,char gen,String dob)
	{
		this();
		System.out.println("Args Constructor 2");
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;
	}
	Q222FormChaining(String name,long phno,char gen,String dob,long tel)
	{
		this(name,phno,gen,dob);
		System.out.println("Args Constructor 3");
		this.tel=tel;
	}
	Q222FormChaining(String name,long phno,char gen,String dob,long tel,String blood)
	{
		this(name,phno,gen,dob,tel);
		System.out.println("Args Constructor 4");
		this.blood=blood;
	}
	Q222FormChaining(String name,long phno,char gen,String dob,long tel,String blood,String email)
	{
		this(name,phno,gen,dob,tel,blood);
		this.email=email;
	}	
	public void displayForms()
	{
		System.out.println("Name : "+name);
		System.out.println(" Phone No : "+phno);
		System.out.println(" Telephone No : "+tel);
		System.out.println(" Email : "+email);
		System.out.println(" Blood : "+blood);
		System.out.println(" Date Of Birth : "+dob);
		System.out.println(" Gender : "+gen);
	}
}

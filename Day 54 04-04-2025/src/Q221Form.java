class Q221Form
{
	String name ;
	long phno ;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;
	Q221Form()
	{
		
	}
	Q221Form(String name,long phno,char gen,String dob)
	{
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;
	}
	Q221Form(String name,long phno,char gen,String dob,long tel)
	{
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;

		this.tel=tel;
	}
	Q221Form(String name,long phno,char gen,String dob,long tel,String blood)
	{
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;

		this.tel=tel;
		this.blood=blood;
	}
	Q221Form(String name,long phno,char gen,String dob,long tel,String blood,String email)
	{
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;

		this.tel=tel;
		this.blood=blood;
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

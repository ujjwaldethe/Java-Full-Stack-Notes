class DBConnection 
{
	String dbname ; 
	String user;
	String pass;
	public DBConnection displayDBDetails()
	{
		System.out.println("Database Name : "+dbname);
		System.out.println("Username : "+user);
		System.out.println("Password : "+pass);
		return this;
	}
}

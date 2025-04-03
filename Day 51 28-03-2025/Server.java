class Server 
{
	String name;
	String ip ;
	int portNo;
	String status;
	{
		status="On";
	}
	public Server displayServer()
	{
		System.out.println("Name : "+name);
		System.out.println("ip : "+ip);
		System.out.println("Port No : "+portNo);
		return this;
	}
	public DBConnection displayDB()
	{	
		status="on";
		System.out.println("Status : "+status);
		DBConnection d1 = new DBConnection();
		d1.dbname="MYSQL";
		d1.user="root";
		d1.pass="9370";
		return d1;
	}
	
}

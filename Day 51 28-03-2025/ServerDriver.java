class ServerDriver 
{
	public static void main(String[] args) 
	{
		Server s = new Server();
		s.name="AWS";
		s.ip="192.168.0.1";
		s.portNo=1234;
		s.displayServer().displayDB().displayDBDetails();
	}
}

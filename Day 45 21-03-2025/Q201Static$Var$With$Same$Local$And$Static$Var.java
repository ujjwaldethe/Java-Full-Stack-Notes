class Q201Static$Var$With$Same$Local$And$Static$Var 
{
	static String s;
	public static void main(String[] args) 
	{
		System.out.println("Default Value Of S : "+s);
		demo();
		String s = "Tejus";
		//When we have class var and local var with same name then priority given to local var and to access class variable use class name as reference
		System.out.println("Priority Given To Local Variable S : "+s);
		System.out.println("Accessing Global Variable Using Class Reference : "+Q201Static$Var$With$Same$Local$And$Static$Var.s);
	}
	public static void demo()
	{
		s="Qspiders";
		System.out.println("Demo Method Called S : "+s);
	}
}

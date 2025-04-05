class Q221FormDriver 
{
	public static void main(String[] args) 
	{
		Q221Form f1 = new Q221Form("Ujjwal",9370682720l,'M',"20-11-2002");
		f1.displayForms();
		Q221Form f2 = new Q221Form("Ujjwal",9370682720l,'M',"20-11-2002",22342343123l);
		f2.displayForms();
		Q221Form f3 = new Q221Form("Ujjwal",9370682720l,'M',"20-11-2002",22342343123l,"O+");
		f3.displayForms();
		Q221Form f4 = new Q221Form("Ujjwal",9370682720l,'M',"20-11-2002",22342343123l,"O+","ujwaldethe518@gmail.com");
		f4.displayForms();

	}
}

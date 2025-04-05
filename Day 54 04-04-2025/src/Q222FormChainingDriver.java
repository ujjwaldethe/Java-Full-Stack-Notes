class Q222FormChainingDriver 
{
	public static void main(String[] args) 
	{
		Q222FormChaining f1 = new Q222FormChaining("Ujjwal",9370682720l,'M',"20-11-2002");
		f1.displayForms();
		Q222FormChaining f2 = new Q222FormChaining("Ujjwal",9370682720l,'M',"20-11-2002",22342343123l);
		f2.displayForms();
		Q222FormChaining f3 = new Q222FormChaining("Ujjwal",9370682720l,'M',"20-11-2002",22342343123l,"O+");
		f3.displayForms();
		Q222FormChaining f4 = new Q222FormChaining("Ujjwal",9370682720l,'M',"20-11-2002",22342343123l,"O+","ujwaldethe518@gmail.com");
		f4.displayForms();

	}
}

class Q216MangoMethodChainingDriver 
{
	public static void main(String[] args) 
	{
		Q216MangoMethodChaining m = new Q216MangoMethodChaining();
		m.price = 2400.0;
		m.type  = "Hapus";
		m.origin = "Ratanagiri";

		m.displayType().displayPrice().displayOrigin();
	}
}

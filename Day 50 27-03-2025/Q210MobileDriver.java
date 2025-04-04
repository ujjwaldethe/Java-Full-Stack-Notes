class Q210MobileDriver 
{
	public static void main(String[] args) 
	{
		Q210Mobile m = new Q210Mobile();
		m.brand="Apple";
		m.ram=16;
		m.price=150000;
		m.rom = 1 ;
		m.cam=3;
		System.out.println("Brand : "+m.brand);
		System.out.println("Ram : "+m.ram);
		System.out.println("Price : "+m.price);
		System.out.println("Rom : "+m.rom);
		System.out.println("Camera : "+m.cam);
		
		Q210Mobile s = new Q210Mobile();
		s.brand="Samsung";
		s.ram=16;
		s.price=85000;
		s.rom = 1 ;
		s.cam=4;
		System.out.println("Brand : "+s.brand);
		System.out.println("Ram : "+s.ram);
		System.out.println("Price : "+s.price);
		System.out.println("Rom : "+s.rom);
		System.out.println("Camera : "+s.cam);		

	}
}

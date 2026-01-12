class  char_widening 
{
	public static void main(String[] args) 
	{
		char c1 = 'R';
		System.out.println(c1); //R
		
		int i1 = c1;
		System.out.println(i1); // 82
		
		long l1 = c1;
		System.out.println(l1); //82
		
		float f1 = c1;
		System.out.println(f1); //82.0
		
		double d1 = c1;
		System.out.println(d1); //82.0
	}
}

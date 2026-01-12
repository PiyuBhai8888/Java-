class short_widening 
{
	public static void main(String[] args) 
	{
		
		short s1 = 356;
		System.out.println(s1); //356
		
		// char c1 = s1;
		// System.out.println(c1);
		// error: incompatible types: possible lossy conversion from short to char
	
	int i1 = s1;
	System.out.println(i1); // 356 
	
	long l1 = s1;
	System.out.println(l1);// 356
	
	float f1 = s1;
	System.out.println(f1);// 356.0
	
	double d1 = s1;
	System.out.println(d1);// 356.0
	
	}
}

class byte_widening 
{
	public static void main(String[] args) 
	{
		byte b1 = 95;
		 System.out.println(b1);  // output- 95
		
		 short s1 = b1;
		 System.out.println(s1); //output- 95
		
		// char c1= b1 ;
		// System.out.println(c1);
		// error: incompatible types: possible lossy conversion from byte to char
		
		 int i1= b1;
		System.out.println(i1); //output- 95
		
		 long l1 = b1;
		 System.out.println(l1); // output- 95
		
		 float f1 = b1;
		 System.out.println(f1); // output- 95.0
		
		 double d1= b1;
		 System.out.println(d1); // output- 95.0
	}
}

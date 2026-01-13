class narrowing_positive3
{
	public static void main(String[] args) 
	{
		int b1 = 2147483848;
		System.out.println(b1); 
		// error integer number too large
		
	    int b1 = (int) 2147483848;
		System.out.println(b1); // error integer number too large
		
		int b2 = (int) 4294967696;
		System.out.println(b2); // error integer number too large
		
		int b3 = (int) 92743979734943; 
		System.out.println(b3); // error integer number too large
		
		int b4 = (int) -2147483848;
		System.out.println(b4); // error integer number too large
		
		int b5 = (int) -4294967696;
		System.out.println(b5);// error integer number too large
		
		int b6 = (int) -92743979734943;
		System.out.println(b6); // error integer number too large 
		
} }

class narrowing_positive2
{
	public static void main(String[] args) 
	{
		//short b1 = 32768;
		//System.out.println(b1); 
		// error: incompatible types: possible lossy conversion from int to byte
		
	    short b1 = (short) 32768;
		System.out.println(b1); //-32768
		
		short b2 = (short) 65536;
		System.out.println(b2); //0
		
		short b3 = (short) 98304; 
        System.out.println(b3); // -32768
		
		short b4 = (short) 131072;
		System.out.println(b4); //0
		
		short b5 = (short) 62376854;
		System.out.println(b5);// -13418
		
		short b6 = (short) -32768;
		System.out.println(b6); //-32768
		
		short b7 = (short)  -65536;
		System.out.println(b7); //0
		
		short b8 = (short)  -98304;
		System.out.println(b8); // -32768
		
		short b9 = (short) -131072;
		System.out.println(b9); //0
		
		short b10 = (short) -62376854;
		System.out.println(b10); //13418
} }

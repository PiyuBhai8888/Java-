class narrowing_positive
{
	public static void main(String[] args) 
	{
		// byte b1 = 128;
		// System.out.println(b1); 
		// error: incompatible types: possible lossy conversion from int to byte
		
	    // byte b1 = (byte) 128;
		// System.out.println(b1); //-128
		
		// byte b1 = (byte) 256;
		// System.out.println(b1); //0
		
		// byte b1 = (byte) 384; 
        // System.out.println(b1); // -128
		
		// byte b1 = (byte) 512;
		// System.out.println(b1); //68
		
		// byte b1 = (byte) 654;
		// System.out.println(b1);// -114
		
		// byte b2 = (byte) -128;
		// System.out.println(b2); //-128
		
		// byte b2 = (byte)  -256;
		// System.out.println(b2); //0
		
		// byte b2 = (byte)  -384;
		// System.out.println(b2); // -128
		
		// byte b2 = (byte) -512;
		// System.out.println(b2); //0
		
		byte b2 = (byte) -654;
		System.out.println(b2); //114
} }

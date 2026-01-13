class narrowing
{
	public static void main(String[] args) 
	{
		double d1 = 2497.432;
		System.out.println(d1); //2497.432
		
	float f1 = (byte)d1;
   System.out.println(f1); //-63.0
   
   float f2 = (short)d1;
   System.out.println(f2); //2497.0
   
   float f3 = (char)d1;
   System.out.println(f3); // 2497.0
   
   float f4 = (int)d1;
   System.out.println(f4); //2497.0
   
   float f5 = (long)d1;
   System.out.println(f5); //2497.0
   
   float f6 = (float)d1;
   System.out.println(f6); //2497.432
   
   //float f7 = (double)d1;
   //System.out.println(f7);
    //error: incompatible types: possible lossy conversion from double to float
   
	}
}

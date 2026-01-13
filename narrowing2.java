class narrowing2
{
	public static void main(String[] args) 
	{
		double d1 = 24897.432 ;
		System.out.println(d1); //24897.432
		
	int i1 = (byte)d1;
   System.out.println(i1); //65
   
   int i2 = (short)d1;
   System.out.println(i2); //24897
   
   int i3 = (char)d1;
   System.out.println(i3); // 24897
   
   int i4 = (int)d1;
   System.out.println(i4); //24897
   
   // int i5 = (byte)(int)(long)d1;
   // System.out.println(i5); //65
   
   int i5 = (int)(long)d1;
   System.out.println(i5); //24897
   
   int i6 =(short)(int) (float)d1;
   System.out.println(i6); //24897
   
   int i7 = (int) (double)d1;
   System.out.println(i7); //24897
   
  // int i7 = (long) (int) (double)d1;
  // System.out.println(i7); // error: incompatible types: possible lossy conversion from long to int
	}
}

class  float_narrowing
{
	public static void main(String[] args) 
	{
			
	float f1 =238.532f;
   System.out.println(f1); //238.532
   
   long l1= (long)f1;
   System.out.println(l1);//238
	
  int i1 = (int)f1;
  System.out.println(i1);// 238
  
  char c1= (char)f1;
  System.out.println(c1); // i
  
  short s1 = (short)f1;
  System.out.println(s1); // 238
  
  byte b1 = (byte)f1;
  System.out.println(b1); // -18

	}
}

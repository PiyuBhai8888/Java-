class  long_narrowing
{
	public static void main(String[] args) 
	{
			  
   long l1= 376577438;
   System.out.println(l1);//376577438
	
  int i1 = (int)l1;
  System.out.println(i1);// 376577438
  
  char c1= (char)l1;
  System.out.println(c1); // ?
  
  short s1 = (short)l1;
  System.out.println(s1); // 7582
  
  byte b1 = (byte)l1;
  System.out.println(b1); // -98

	}
}

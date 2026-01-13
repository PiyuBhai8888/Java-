class  int_narrowing
{
	public static void main(String[] args) 
	{
			  
   //int i1= 65534;
   //System.out.println(i1); 
   
   
   int i1= 765787258;
   System.out.println(i1);//765787258
  
  char c1= (char)i1;
  System.out.println(c1); // ?
  
  short s1 = (short)i1;
  System.out.println(s1); // -902
  
  byte b1 = (byte)i1;
  System.out.println(b1); // 122

	}
}

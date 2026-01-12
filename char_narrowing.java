class  char_narrowing
{
	public static void main(String[] args) 
	{
			   
  char c1= 'P';
  System.out.println(c1); // P
  
  short s1 = (short)c1;
  System.out.println(s1); // 80
  
  byte b1 = (byte)c1;
  System.out.println(b1); // 80

	}
}

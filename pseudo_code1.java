class pseudo_code1 
{
	public static void main(String[] args) 
	{
		int a=7, b=9, c=3, d;
		
		d = a++ - b-- + ++c;
		b = d++ + a++ + c++;
		c = b-- + --a + d--;
		a = --b + a++;
		
		System.out.println(a);//20
		System.out.println(b);//12
		System.out.println(c);//25
		System.out.println(d);//2
	}
}

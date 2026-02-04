class pseudo_code2 
{
	public static void main(String[] args) 
	{
		int p = -3, q = 8, r = 13, s;
		
		s = p++ - q-- * r ;
		q = --p + s++ - --q;
		p = p++ * p-- - r;
		r = r--;
		System.out.println("p"+p);//-7
		System.out.println("q"+q);//-116
		System.out.println("r"+r);//13
		System.out.println("s"+s);//-107
	}
}

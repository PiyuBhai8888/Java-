class largest_3number
{
	public static void main(String[] args) 
	{
		int num1= 843;
		int num2= 842;
		int num3= 2678;
		
		int lager = num1 > num2 ? num1 : num2;
		int largest= num3>lager ? num3  : lager;
		System.out.println(largest);
	}
}

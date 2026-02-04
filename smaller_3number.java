class smaller_3number 
{
	public static void main(String[] args) 
	{
		int num1 = 2996;
		int num2 = 723;
		int num3 = 9287;
		
		int small = num1 < num2 ? num1 : num2;
		int smaller = num3 < small ? num3 : small;
		System.out.println(smaller);
	}
}

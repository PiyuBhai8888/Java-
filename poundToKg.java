import java.util.Scanner;
class poundToKg 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		final double onepound = 0.454;	
		System.out.println("enter a number in pound: ");
		double pound = sc.nextDouble();
		
		final double kilogram = pound * onepound;
		System.out.printf(pound+"pounds is "+kilogram+" kilogram ");
	}
}

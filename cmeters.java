import java.util.Scanner;
class cmeters 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		final double oneFeet = 0.305;	
		System.out.println("enter a value for feet: ");
		double feet = sc.nextDouble();
		
		final double meter = feet * oneFeet;
		System.out.printf(feet+"feet is "+meter+" meter ");
	}
}

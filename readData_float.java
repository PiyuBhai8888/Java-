import java.util.Scanner;

class readData_float
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");//43.4362432
		float n1 = sc.nextFloat();
		
		System.out.println("Enter the second number");//432.4351431
		float n2 = sc.nextFloat();
		
		float ans = n1 * n2;
		
		System.out.println("The sum of " +n1+ " and " +n2+ " is: " +ans);//18783.36
	}
}
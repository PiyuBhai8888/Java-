import java.util.Scanner;

class readData_double 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");//926.3526
		double n1 = sc.nextDouble();
		
		System.out.println("Enter the second number");//246.24632
		double n2 = sc.nextDouble();
		
		double ans = n1 % n2;
		
		System.out.println("The sum of " +n1+ " and " +n2+ " is: " +ans);//187.61364000000006
	}
}

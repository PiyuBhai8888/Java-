import java.util.Scanner;

class readData_short
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");//4574
		short n1 = sc.nextShort();
		
		System.out.println("Enter the second number");//4654
		short n2 = sc.nextShort();
		
		int ans = n1 + n2;
		
		System.out.println("The sum of " +n1+ " and " +n2+ " is: " +ans);//9228
	}
}

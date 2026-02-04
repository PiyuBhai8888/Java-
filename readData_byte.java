import java.util.Scanner;

class readData_byte 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");//32
		byte n1 = sc.nextByte();
		
		System.out.println("Enter the second number");//54
		byte n2 = sc.nextByte();
		
		int ans = n1 + n2;
		
		System.out.println("The sum of " +n1+ " and " +n2+ " is: " +ans);//86
	}
}

import java.util.Scanner;

class readData_int 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");//867
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second number");//23
		int n2 = sc.nextInt();
		
		int ans = n1 + n2;
		
		System.out.println("The sum of" +n1+ "and" +n2+"is: "+ans); //890
	}
}

import java.util.Scanner;

class readData_boolean
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter boolean value (true/false)");//true 
		
		boolean n1 = sc.nextBoolean(); 
		
    	System.out.println("You entered:"+n1);//true
	}
}
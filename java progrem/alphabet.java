import java.util.Scanner;
class alphabet 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a char");
		char ch = sc.next().charAt(0);
		String op= ((ch >= 'A' && ch <= 'Z') || (ch <= 'a' && ch>='z')
			)?
		(ch+" its is an alphbet")
			:
			(ch+ "its is not an alphbet ");
		
		System.out.println(op);
	}
}

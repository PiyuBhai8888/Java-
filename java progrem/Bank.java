import java.util.Scanner;
class Bank
{
	static String name;
	static String address;
	static long contact;
	static long adhar;
	static String pancard;
	static double balance;
	static int pin;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		welcomeLoop :
			for (; ; )
			{
			System.out.println("\n **** WELCOME ****");
			System.out.println("***** LAXMI CHIT FUND *****\n");
			System.out.print(" 1.CREATE ACCOUNT \n 2.LOGIN\n");
			System.out.print("Enter your resp : ");
			int resp = sc.nextInt();
			switch (resp)
			{
			case 1 :{
			if(name!=null)
				{
					System.out.println("\n ACCOUNT ALREADY EXSIST \n");
					continue;
				}
				System.out.println("\n ACCOUNT CREATION PAGE \n");
				System.out.print("Name : ");
				name = new Scanner(System.in).nextLine();
				System.out.print("Address : ");
				address = new Scanner(System.in).nextLine();
				System.out.print("Contact : ");
				contact = new Scanner(System.in).nextLong();
				System.out.print("Pancard : ");
				pancard = new Scanner(System.in).next();
				System.out.print("Adhar : ");
				adhar = new Scanner(System.in).nextLong();
				System.out.print("Enetr an amount : ");
				balance = new Scanner(System.in).nextDouble();
				System.out.print("Pin : ");
				pin = new Scanner(System.in).nextInt();
				System.out.println("*** ACCOUNT CREATED SCUCCESFULLY *** \n");
				break;				
			}
			case 2 : {
				if (name == null)
				{
					System.out.println("\n CREATE YOUR ACCOUNT FIRST\n");
		            continue;
				}
				System.out.println("\n LOGIN MODULE \n");
				System.out.print("Contact : ");
				long userContact = new Scanner(System.in).nextLong();
				System.out.print("Pin : ");
				long userPin = new Scanner(System.in).nextInt();
				
 				if(contact == userContact && pin == userPin){
					System.out.println("\n LOGIN SCUCCESFULL ***** \n");
					
					features :
						for (; ; ){
						System.out.println("\n ***** FEATURES *****\n");
					   System.out.println(" 1.DEPOSIT \n 2.WITHDRAW \n 3.CHECK BALANCE \n 4.LOGOUT ");
					   System.out.print("\nEnter your Option : ");
					   int opt = sc.nextInt();
					  
					  switch (opt)
					  {
					  case 1 :
						  {
						  System.out.println("\n DESPOSIT AMOUNT MODULE\n");
						  System.out.print("Enter Deposit Amount : ");
						  double deptAmt = new Scanner(System.in).nextDouble();
						  balance += deptAmt;
						  System.out.println("\n AMOUNT DEPOSITED SCUCCESFULLY\n");
						  break;
						  }
						  case 2 :
						  {
							  System.out.println("\n WITHDRAW AMOUNT MODULE\n");
							  System.out.println("Enter an Amount : ");
							  double wdrwAmt = new Scanner(System.in).nextDouble();
							  System.out.println("Enter an Pin : ");
							  int pin2 = new Scanner(System.in).nextInt();
							  if (pin2 == pin)								  
							  {
								  if (wdrwAmt <= balance)
								  {
									  balance -= wdrwAmt;
									  System.out.println("\n AMOUNT DEBITED SCUCCESFULLY\n");
								  }
								  else 
									  {
									System.out.println("\n INSUFFICIENT FUNDS \n");
								  } 
							  }
							 else 
								 {
								System.out.println("\n INVALID PIN\n");															 
								}
							  break;
						  }
						  case 3:
						  {
							System.out.println("\n CHECK BALANCE MODULE\n");
							System.out.print("Enter your Pin : \n");
							int pin3 = new Scanner(System.in).nextInt();
							if(pin3 == pin)
								{
								System.out.println("\n Your Account balance is : " +balance+ "RS.");
	     					}
							else 
							  {
								System.out.print("\n INVALID PIN \n");
							  }
							  break;								
						  }
						  case 4:
							  {
							System.out.println("\n Thank You & Visit Again \n");
							continue welcomeLoop;
						  }
						  default:
							  {
							System.out.println("\n INVALID RESPONSE \n");
						  }	  
					  }
					}
				}else 
					{
					System.out.print("\n INVALID CRED \n");
				}
				break;
				}
				default:
							  {
							System.out.println("\n INVALID RESPONSE \n");
						  }	 
			          }			
	        	}
	     }
}
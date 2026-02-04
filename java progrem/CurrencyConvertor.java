import java.util.Scanner;
class CurrencyConvertor
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		//infiniteloop
		
		for (; ; )
		{
			System.out.println("\n Welcome");
			System.out.println("\n Currency Convertor \n");
			System.out.print("Enter an Amount (INR)");
			double amount = sc.nextDouble();
			
			System.out.println(" 1. USD \n 2. EUR \n 3. KWD \n 4.GBP \n 5.CAD \n 6. ARS \n 7. AWG \n 8. JPY \n 9. BZD \n 10. DOP ");
			System.out.print("Enter your response");
			String resp = sc.next().toUpperCase();
			
			boolean assump =true;
			double convertedAmount= 0;
			if(resp.equals("USD")){
				convertedAmount = amount /90.21;
			}
			else if (resp.equals("EUR")){
				convertedAmount = amount /106.53;
			}
			else if(resp.equals("KWD")){
				convertedAmount = amount /293.61;
			}
			else if(resp.equals("GBP")){
				convertedAmount = amount /123.25;
			}
			else if(resp.equals("CAD")){
				convertedAmount = amount /66.13;
			}
			else if(resp.equals("ARS")){
				convertedAmount = amount /0.06;
			}
			else if(resp.equals("AWG")){
				convertedAmount = amount /50.43;
			}
			else if(resp.equals("JPY")){
				convertedAmount = amount /0.57;
			}
			else if(resp.equals("BZD")){
				convertedAmount = amount /44.83;
			}
			else if(resp.equals("DOP")){
				convertedAmount = amount /1.42;
			}
			else{
				assump =false;
				System.out.println("\n INVALID CURR \n");
			}
			if (assump)
			
			System.out.printf( "%n%20.2f INR = %.2f %s %n", amount,convertedAmount,resp);	
			
			
			
		}
		
		
	}
}

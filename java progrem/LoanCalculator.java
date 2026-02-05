import java.util.Scanner;
class  LoanCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		for (; ; )
		{
			System.out.println("\n ***** WELCOME *****\n");
			
			System.out.print("Amount : ");
			double amount = sc.nextDouble();
			if (amount<1000 || amount>1000000)
			{
				System.out.println("\n INVALID AMOUNT \n");
				continue;
			}
			
			System.out.print("Rate of Interest (P.M) : ");
			double interest = sc.nextDouble();
			if(interest<1 || interest>30)
			{
				System.out.println("\n INVALID AMOUNT \n");
				continue;
			}
			
						System.out.print("Loan Tenure (Months) : ");
			int tenure = sc.nextInt();
			if(tenure<3 || tenure>36)
			{
				System.out.println("\n INVALID AMOUNT \n");
				continue;
			}
			
			double perMonthInt = (amount/100) * interest;
			double totalInterestAmount = perMonthInt*tenure;
			double emi = (amount+totalInterestAmount)/tenure;
			double totalAmount = amount+totalInterestAmount;
			
			System.out.println("\n Monthly EMI : "+emi);
			System.out.println("\n Principal Amount : "+amount);
			System.out.println("\n Total Interest : "+totalInterestAmount);
			System.out.println("\n Total Amount : "+totalAmount);
		}		
	}
}

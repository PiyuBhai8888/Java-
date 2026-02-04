import java.util.Scanner;
class StonePaperScissor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		infiniteLoop :
			for (; ; )
			{
			System.out.println("\n **** WELCOME ****");
			//USER IMPLEMENTATION
			System.out.println("1.Stone \n 2.Paper \n 3.Scissor\n");
		    System.out.println("Enter your response : ");
			int dgtUser = sc.nextInt();
			String user = "";
			if(dgtUser==1) user="STONE";
			else if(dgtUser==2)user="PAPER";
			else if(dgtUser==3)user="SCISSOR";
			else{
				System.out.println("\n INVALID RESPONSE \n");
				continue infiniteLoop;
			}
			// BOT IMPLEMENTATION
			
			int dgtBot = 0;
			for (; ; ){
				dgtBot = (int)(Math.random()*10);
				if(dgtBot>=1 && dgtBot<=3)
					break;
			}
			String bot = "";
			if(dgtBot==1) bot="STONE";
			else if(dgtBot==2)bot="PAPER";
			else bot="SCISSOR";
			
	}
}

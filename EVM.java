import java.util.Scanner;

class EVM {

    static int bjp = 0, app = 0, cmg = 0, mns = 0, nota = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Population: ");
        int population = sc.nextInt();

        for (int i = 1; i <= population; i++) {

            System.out.println("\n--- Welcome Voter " + i + " ---");
            System.out.println("Apka ek vote desh badal sakta hai");
            System.out.println("1. BJP\n2. APP\n3. CMG\n4. MNS\n5. NOTA");
            System.out.print("Enter your response: ");

            String resp = sc.next().toUpperCase();

            if (resp.equals("BJP")) {
                bjp++;
                System.out.println("You have voted for BJP");

            } 
            else if (resp.equals("APP")) {
                app++;
                System.out.println("You have voted for APP");

            } 
            else if (resp.equals("CMG")) {
                cmg++;
                System.out.println("You have voted for CMG");

            } 
            else if (resp.equals("MNS")) {
                mns++;
                System.out.println("You have voted for MNS");

            } 
            else if (resp.equals("NOTA")) {
                nota++;
                System.out.println("You have voted for NOTA");

            } 
            else {
                System.out.println("Invalid Response");
                i--;
            }
        }

        System.out.println("\n--- Result ---");
        System.out.println("BJP : " + bjp);
        System.out.println("APP : " + app);
        System.out.println("CMG : " + cmg);
        System.out.println("MNS : " + mns);
        System.out.println("NOTA: " + nota);
		
		if (bjp >= cmg && bjp >=mns && bjp >=aap && bjp >= nota)
		{
			System.out.println("BJP has won the election by "+bjp+"votes");
		}
				else if (cmg >=mns && cmg >=aap && cmg >= nota)
		{
			System.out.println("CMG has won the election by "+cmg+"votes");
		}
				else if (mns >=aap && mns >= nota)
		{
			System.out.println("MNS has won the election by "+mns+"votes");
		}
				else if (aap >= nota)
		{
			System.out.println("AAP has won the election by "+aap+"votes");
		}
		else {
			System.out.println("NOTA has won the election by "+nota+"votes");
		}
    }
}
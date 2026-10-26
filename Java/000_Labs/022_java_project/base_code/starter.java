/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int money = 100;
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("----------------------------------------------------");
		System.out.println("");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) or (No/no/N/n)");
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		if (answer.equals("No") || answer.equals("no") || answer.equals("N") || answer.equals("n")){
			System.out.println("Thank you for playing! Don't come back if you don't want to play.");
		}
			while(answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")){
				if (money == 0){
					System.out.println("You have no money left to wager. Thank you for playing!");
				break;
			    }
			    System.out.print("How much would you like to wager?");
			    int wager = sc.nextInt();
			    int roll1 = (int)(Math.random()*11+1);
			    int roll2 = (int)(Math.random()*11+1);
			    int roll3 = (int)(Math.random()*11+1);

				if (wager>100){
					System.out.println("You cannot wager more than $100. Please enter a valid wager.");
				    wager = sc.nextInt();
				}
				
				    else if(wager<=100){
						System.out.println("The slot machine rolled: ");
						System.out.println(" | "+ roll1 + " | " + roll2 + " | " + roll3 + " |");
					}
					if(roll1 == roll2 && roll2 == roll3){
						System.out.println("Congratulations! You tripled your money!");
						wager = (wager*3) + money;
						System.out.println("You now have $" + wager + ".");
					}
					else if(roll1 == roll2 || roll1 == roll3 || roll2 == roll3){
						System.out.println("Congratulations! You doubled your money!");
						wager = (wager*2) + money;
						System.out.println("You now have $" + wager + ".");
					}
					else{
						System.out.println("Sorry, you lost your wager.");
						wager = money - wager;
						System.out.println("You now have $" + wager + ".");
					}
					
						money = wager;
					
				
			
		    }
	   	
    } 
}

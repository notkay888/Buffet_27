/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();

		if(answer.equals("Wizard")) {
			System.out.println("You have chosen to be a Wizard! You will have the ability to cast spells and use magic to defeat your enemies.");
		}
		else if(answer.equals("Warrior")) {
			System.out.println("You have chosen to be a Warrior! You will have the ability to wield weapons and use brute strength to defeat your enemies.");
		}
		else if(answer.equals("Rogue")) {
			System.out.println("You have chosen to be a Rogue! You will have the ability to sneak around and use stealth to defeat your enemies.");
		}
		else {
			System.out.println("You did not choose a valid class. Please choose Wizard, Warrior, or Rogue.");
		}
	}
}

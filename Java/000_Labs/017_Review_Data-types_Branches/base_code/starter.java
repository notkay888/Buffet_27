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
		System.out.println("Welcome to Hero's Journey Character Creator!");
		System.out.println("Please enter your character's name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Your character's name is " + name + ".");
		System.out.println("Please enter your character's title(Ex. Slayer of Dragons, Protector of the Realm, etc.):");
		String title = sc.nextLine();
		System.out.println("Your character's title is " + title + ".");
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
		Scanner sc2 = new Scanner(System.in);
		String answer = sc2.nextLine();

		if(answer.equals("Wizard") || answer.equals("wizard")) {
			System.out.println("You have chosen to be a Wizard! You will have the ability to cast spells and use magic to defeat your enemies.");
		}
		    else if(answer.equals("Warrior") || answer.equals("warrior")) {
			System.out.println("You have chosen to be a Warrior! You will have the ability to wield weapons and use brute strength to defeat your enemies.");
		    }
		    else if(answer.equals("Rogue") || answer.equals("rogue")) {
			System.out.println("You have chosen to be a Rogue! You will have the ability to sneak around and use stealth to defeat your enemies.");
		    }
		    else {
			System.out.println("You did not choose a valid class. Please choose Wizard, Warrior, or Rogue.");
		    }
		
		System.out.println("You have four traits with a maximum of 10 points each. You have 20 points to distribute among the four traits.");
		System.out.println("The four traits are shown below:");
		System.out.println("Strength - Buff and able to carry larger items");
		System.out.println("Dexterity - Quick and agile, able to dodge attacks");
		System.out.println("Intelligence - Smart and knowledgeable, able to cast powerful spells");
		System.out.println("Charisma - Charming and persuasive, able to talk your way out of a situation");

		System.out.println("How many points would you like to put into Strength?");
		int strength = sc.nextInt();
		if(strength > 10) {
			System.out.println("You cannot put more than 10 points into Strength. Please choose a valid number of points.");
			strength = sc.nextInt();
	    }  
		    else if(strength <=10) {
			System.out.println("You have chosen to put " + strength + " points into Strength.");
			int pointsLeft = 20 - strength;
			System.out.println("You have " + pointsLeft + "left to distribute among the other three traits.");
		    }
		
		System.out.println("How many points would you like to put into Dexterity?");
		int dexterity = sc.nextInt();
		if(dexterity > 10) {
			System.out.println("You cannot put more than 10 points into Dexterity. Please choose a valid number of points.");
			dexterity = sc.nextInt();
		}
		    else if(dexterity <=10) {
			System.out.println("You have chosen to put " + dexterity + " points into Dexterity.");
			int pointsLeft = 20 - strength - dexterity;
			System.out.println("You have " + pointsLeft + "left.");
		    }

		if(strength + dexterity == 20) {
			System.out.println("You have no points left to distribute among the other two traits.");
		}
		int intelligence = 0;
		if(strength + dexterity < 20) {
			System.out.println("How many points would you like to put into Intelligence?");
			intelligence = sc.nextInt();
		}
		else if(intelligence > 10) {
			System.out.println("You cannot put more than 10 points into Intelligence. Please choose a valid number of points.");
			intelligence = sc.nextInt();
		}
		else if(intelligence <=10) {
			System.out.println("You have chosen to put " + intelligence + " points into Intelligence.");
			int pointsLeft = 20 - strength - dexterity - intelligence;
			System.out.println("You have " + pointsLeft + "left.");
		}

		int charisma = 0;
		if(strength + dexterity + intelligence < 20) {
			System.out.println("How many points would you like to put into Charisma?");
			charisma = sc.nextInt();
		
		    if(charisma > 10) {
				System.out.println("You cannot put more than 10 points into Charisma. Please choose a valid number of points.");
				charisma = sc.nextInt();
		    }
		    else if(strength + dexterity + intelligence == 20) {
			System.out.println("You have no points left to distribute among the other traits.");
		    }
			else if(charisma <= 10) {
			System.out.println("You have chosen to put " + charisma + " points into Charisma.");
			int pointsLeft = 20 - strength - dexterity - intelligence - charisma;
			System.out.println("You have " + pointsLeft + "left.");
		    }
		}
		System.out.println("You are:" + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + answer + " with the following stats!");
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Charisma: " + charisma);
		System.out.println(" ");
		System.out.println("Good luck on your quest " + name + "!");

	}
}

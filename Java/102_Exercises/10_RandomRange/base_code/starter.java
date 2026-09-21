/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		Scanner sc = new Scanner (System.in);
		int nu = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int nu2 = sc.nextInt();

		System.out.println("Your range is " + nu + " to " + nu2);
		System.out.println("Here are 5 numbers generated in that range.");
		int num1 = (int)(Math.random()*(nu2-nu)+nu);
		int num2 = (int)(Math.random()*(nu2-nu)+nu);
		int num3 = (int)(Math.random()*(nu2-nu)+nu);
		int num4 = (int)(Math.random()*(nu2-nu)+nu);
		int num5 = (int)(Math.random()*(nu2-nu)+nu);
		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
        
	}
}

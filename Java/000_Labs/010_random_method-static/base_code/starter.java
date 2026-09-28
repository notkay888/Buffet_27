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
		System.out.print("I love to learn coding remotely.");
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*100+1);
		double num3 = (double)(Math.random()*1+2.5);
		double num4 = (double)(Math.random()*575.0+14.0);
		System.out.println("Random number between 0 and 9: " + num1);
		System.out.println("Random number between 1 and 100: " + num2);
		System.out.println("Random number between 2.5 and 3.5: " + num3);
		System.out.println("Random number between 14.0 and 589.0: " + num4);

	}
}

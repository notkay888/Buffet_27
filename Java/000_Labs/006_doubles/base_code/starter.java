/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature in Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		double celsius = ((fahrenheit - 32) / 1.8);
		System.out.println("Your Celsius temperature is: " + celsius);
	}
}

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
		int num = (int)(Math.random()*1000+1);
		System.out.println("This is a guessing game.");
		System.out.println("You get one chance to guess the number.");
		System.out.println("Please enter a number.");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		if (num1 == num){
			System.out.println("Yay! You guessed the right number. You win!");
		}	

		else if(num1 > num){
			System.out.println("The number you guessed was greater than the number I picked.");
		}	

		else if(num1 < num){
			System.out.println("The number you guessed was lower than the number I picked.");
		}	
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int nu = (int)(Math.random()*1001+1);
		System.out.println("Welcome to the guessing game!");
		System.out.println("Please guess a number: ");
		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();
		while(guess != nu){
			if(guess == nu){
				System.out.println("You got the number!");
				break;
			}
			else if (guess > nu){
 				System.out.println("The number is lower.");
				guess = sc.nextInt();
			}
			else if(guess < nu){
				System.out.println("The number is higher.");
				guess = sc.nextInt();
			}

		}

		

	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int score = sc.nextInt();
		System.out.println("Enter another integer");
		int score2 = sc.nextInt();
		if(score > score2){
			System.out.println("Score " + score + " is greater than score " + score2);
		}
	}
}

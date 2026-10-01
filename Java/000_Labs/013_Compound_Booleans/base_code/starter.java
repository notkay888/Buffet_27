/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Please put in a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Please put in a second number");
		int y = sc.nextInt();
		System.out.println("Please put in a third number");
		int z = sc.nextInt();
		if (x < y || x < z && y < z) {
			System.out.println(z + " is the largest number");
		}
		if (y < x && z < x && z < y) {
			System.out.println(x + " is the largest number");
		}
		if (z < y && x < y && x < z) {
			System.out.println(y + " is the largest number");
		}
        System.out.print("Using the same numbers, ");
		if (z > x && z > y && y > x) {
			System.out.println(x + " is the smallest number");
	    } 
		if (x > y && z > y && z > x) {
			System.out.println(y + " is the smallest number");
		}
		if (y > z && x > z && x > y) {
			System.out.println(z + " is the smallest number");
		}
	}
}

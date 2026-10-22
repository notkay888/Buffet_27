/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		System.out.print("Please enter a width: "); 
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		System.out.print("Please enter a height: "); 
		int height = sc.nextInt();
		int count2 = 0;
	
		while (count2 < height) {
			int count = 0;
			while (count < width) {
				System.out.print("*");
				count++;
			}
			System.out.println();
			count2++;
		}

		System.out.println();
		System.out.println("----------------------");
		System.out.println();
		System.out.print("Please enter an integer: ");
		int nu = sc.nextInt();
		int c1 = 0;
		while (c1 < nu) {
			int c2 = 0;
			while (c2 < c1) {
				System.out.print(" ");
				c2++;
			}
			int c3 = 0;
			while (c3 < nu - c1) {
				System.out.print("*");
				c3++;
		}
	}
}


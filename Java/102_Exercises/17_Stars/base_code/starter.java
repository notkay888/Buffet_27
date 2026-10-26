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
		int c1 = 1;
		while (c1 < nu) {
			int c2 = 0;
			while (c2 < c1) {
				System.out.print("*");
				c2++;
			}
			System.out.println();
            c1++;
	    }

		System.out.println();
		System.out.println("----------------------");
		System.out.println("Reversed Star:");
		System.out.print("Please enter an integer: ");
		int a = sc.nextInt();
		int b1 = 1;
		while (b1 < a+1){
			int b2 = a;
			while (b2 > b1){
				System.out.print(" ");
				b2--;
			}
			int b3 = 0;
			while(b3 <b1){
				System.out.print("*");
				b3++;
			}
			System.out.println();
			b1++;		
		}	
    }
}	


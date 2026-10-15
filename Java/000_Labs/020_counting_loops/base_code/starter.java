/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Please enter your name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("How many times would you like to print your name?");
		int times = sc.nextInt();
		int x = 0;
		while(x < times) {
			if(times <= 0) {
			   break;	
			}
	        System.out.println(name);
			x = x + 1;
		}
	}  
}


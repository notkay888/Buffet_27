/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Print out your full name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Your name is: " + name);
		System.out.println("Print out your age: ");
		int age = sc.nextInt();
		System.out.println("Your age is: " + age);
		System.out.println("Print out your birthday month: ");
		int month = sc.nextInt();
		System.out.println("Your birthday month is: " + month);
		System.out.println("Print out your birthday day: ");
		int day = sc.nextInt();
		System.out.println("Your birthday day is: " + day);
		System.out.println("Print out your birthday year: ");
		int year = sc.nextInt();
		System.out.println("Your birthday year is: " + year);
		System.out.println("Your birthday is: " + month + "/" + day + "/" + year);
		System.out.println("How much is a buck fifty? ");
		double money = sc.nextDouble();
		System.out.println("A buck fifty is: " + money);
	}
}

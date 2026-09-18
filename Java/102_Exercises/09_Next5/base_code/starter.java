/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner number = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int nu = number.nextInt();
		System.out.println("Here are the next 5 numbers!");
		System.out.print(nu +", ");
		System.out.print(+(nu+1) +", ");
		System.out.print(+(nu+2) + ", ");
		System.out.print(+(nu+3) + ", ");
		System.out.print(+(nu+5) + ", ");
		System.out.println(+(nu+6));
		System.out.println("Here are the next 5 multiples of " + nu + "!");
		System.out.print(+nu + ", ");
		System.out.print(+(nu*2)+ ", ");
		System.out.print(+(nu*3)+ ", ");
		System.out.print(+(nu*4) + ", ");
		System.out.print (+(nu*5) + ", ");
		System.out.println(+(nu*6));
		System.out.println("Here is " + nu + " divided by 100!");
		System.out.println(+(nu/100.0));
		System.out.println("Here is " + nu + " divided by 10!");
		System.out.println(+(nu/10.0));

	}
}

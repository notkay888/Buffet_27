/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        double shrimpTempura = 4.75;
        double misoSoup = 2.50;
        double softDrink = 1.25;
        System.out.println("Welcome to Michaela's Sushi Bar");
        System.out.println("Here's our menu:");
        System.out.print("1. Shrimp Tempura - " + "$");
        System.out.println(shrimpTempura);

        System.out.print("2. Miso Soup - " + "$");
        System.out.println(misoSoup);
        
        System.out.print("3. Soft Drink - " + "$");
        System.out.println(softDrink);



        System.out.println("How many Shrimp Tempuras would you like?");
        Scanner sc = new Scanner(System.in);

        int item1Quant = sc.nextInt();
        System.out.println("Item 1 Total is: " + (shrimpTempura*item1Quant));
	}
}

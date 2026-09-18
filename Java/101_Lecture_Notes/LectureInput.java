/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        double shrimpTempuraRoll = 4.75;
        double misoSoup = 2.50;
        double softDrink = 1.25;
        System.out.println("Welcome to Michaela's Sushi Bar!");
        System.out.println("Here's our menu:");
        System.out.print("1. Shrimp Tempura - " + "$");
        System.out.println(shrimpTempuraRoll);

        System.out.print("2. Miso Soup - " + "$");
        System.out.println(misoSoup);
        
        System.out.print("3. Soft Drink - " + "$");
        System.out.println(softDrink);



        System.out.println("How many Shrimp Tempuras would you like?");
        Scanner sc = new Scanner(System.in);

        int item1Quant = sc.nextInt();
        System.out.println("Item 1 Total is: " + (shrimpTempuraRoll*item1Quant));
   
        System.out.println("How many miso soups would you like?");
        int item2Quant = sc.nextInt();
        System.out.println("Item 2 Total is: " + (misoSoup*item2Quant));

        System.out.println("How many soft drinks would you like?");
        int item3Quant = sc.nextInt();
        System.out.println("Item 3 Total is: " + (softDrink*item3Quant));

        double grandTotal = (shrimpTempuraRoll*item1Quant) + (misoSoup*item2Quant) + (softDrink*item3Quant);

        System.out.println("How much would you like to tip?");
        double tip = sc.nextDouble();

        tip = tip/100 * grandTotal;

        System.out.println("The total amount is: " + (grandTotal+tip));
	}
}

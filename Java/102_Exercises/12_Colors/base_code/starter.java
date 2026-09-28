/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int red = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        System.out.println("Here is a random color swatch:");
        getColor(red, green, blue);

        int hong = 256-red;
        int liu = 256-green;
        int lan = 256-blue;
        System.out.println("Here is the complementary color swatch:");
        getColor(red, green, blue);
        getColor(hong, liu, lan);

        System.out.println("Here are the triadic colors of the original color:");
        getColor(red, green, blue);
        getColor(blue, red, green);
        getColor(green, blue, red);

        int hong1 = (int)(Math.random()*129);
        int liu1 = (int)(Math.random()*129);
        int lan1 = (int)(Math.random()*129);
        System.out.println("Here is a dark color swatch:");
        getColor(hong1, liu1, lan1);

        int hong2 = (int)(Math.random()*129+129);
        int liu2 = (int)(Math.random()*129+129);
        int lan2 = (int)(Math.random()*129+129);
        System.out.println("Here is a light color swatch:");
        getColor(hong2, liu2, lan2);
        
        int hong3 = (int)(Math.random()*129);
        int liu3 = (int)(Math.random()*129);
        int lan3 = (int)(Math.random()*129+129);
        System.out.println("Here is a bluer color swatch:");
        getColor(hong3, liu3, lan3);

		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}

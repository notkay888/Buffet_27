/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to the Ascii Museum");
		System.out.println("Please select what exhibit you'd like to view.");
		System.out.println("1. Art and Design");
		System.out.println("2. Cartoon");
		System.out.println("3. Nature");

		Scanner sc = new Scanner(System.in);
		String exhibit = sc.nextLine();

		if(exhibit.equals("art and design")){
			System.out.println("~~~~~ Art and Design Exhibit ~~~~~");
			System.out.println("1. Origami");
			System.out.println("2. Geometry");
			System.out.println("Which piece would you like to view?");
            Scanner sc2 = new Scanner(System.in);
			String piece = sc2.nextLine();
            
			if(piece.equals("origami")){
				System.out.println("                      |b");
				System.out.println("                       ||");
				System.out.println("                       ||,");
				System.out.println("                       |'\\");
				System.out.println("                        |`|");
				System.out.println("                        | `|");
				System.out.println("                        '| |.");
				System.out.println("                         | `L");
				System.out.println("                         |  |,");
				System.out.println("                         `|  |.                              _,/7");
				System.out.println("                          |  `|                       __,---'' /");
				System.out.println("                          |   `|              __,---'\"   ..- ./");
				System.out.println("                          ||   |      _.--=/'',--=-,,  -    ,/");
				System.out.println("                          `|   \\,/'''`\\,     /'   >  \\     /'");
				System.out.println("                           | ,/'  `. .  `\\ ,/'   / \\  \\   /'");
				System.out.println("                   ___,----Y-'      Y     7'   .'.' `\\ \\ /'");
				System.out.println("               _-/''        `\\.     .   ,/'    /.'    `\\\\");
				System.out.println("           _,-''          ---  \\    `  /'    ./.'   __-' \"");
				System.out.println("        _/''     .--            `\\    /'     /,'_--'");
				System.out.println("     ,/''  ..                     `\"\\_     ./ /='");
				System.out.println(" .,/'                             .--\"\\   / / ");
				System.out.println("<------------------,_____      ,/~'  \\ | ./ .'");
				System.out.println("                        `\"\"\"\"\"\"\"      `|_/\\ /");
				System.out.println("                                        '  '");
			}  
				else if(piece.equals("geometry")){
				System.out.println("   .+------+     +------+     +------+     +------+     +------+.");
				System.out.println(" .' |    .'|    /|     /|     |      |     |\\     |\\    |`.    | `");
				System.out.println("+---+--+'  |   +-+----+ |     +------+     | +----+-+   |  `+--+---+");
				System.out.println("|   |  |   |   | |    | |     |      |     | |    | |   |   |  |   |");
				System.out.println("|  ,+--+---+   | +----+-+     +------+     +-+----+ |   +---+--+   |");
				System.out.println("|.'    | .'    |/     |/      |      |      \\|     \\|    `. |   `. |");
				System.out.println("+------+'      +------+       +------+       +------+      `+------+");
				}
				else {
					System.out.println("Sorry, the piece you have selected is not available. Thank you for visiting the Ascii Museum. It is now closed.");
				}				

			}
		
		else if(exhibit.equals("cartoon")){
			System.out.println("~~~~~ Cartoon Exhibit ~~~~~");
			System.out.println("1. Mickey Mouse");
			System.out.println("2. The Simpsons");
            System.out.println("Which piece would you like to view?");
			Scanner sc3 = new Scanner(System.in);
			String piece2 = sc3.nextLine();
			
			if(piece2.equals("mickey mouse")){
                System.out.println("            .-\"\"\"-.");
				System.out.println("           /       \\");
				System.out.println("           \\       /");
				System.out.println("    .-\"\"\"-.-`.-.-.<  _");
				System.out.println("   /      _,-\\ ()()_/:)");
				System.out.println("   \\     / ,  `     `|");
				System.out.println("    '-..-| \\-.,___,  /");
				System.out.println("          \\ `-.__/  /");
				System.out.println("         / `-.__.-\\`");
				System.out.println("        / /|    ___\\");
				System.out.println("       ( ( |.-\"`   `'\\");
				System.out.println("        \\ \\/    {}{}  |");
				System.out.println("         \\|           /");
				System.out.println("          \\        , /");
				System.out.println("          ( __`;-;'__`)");
				System.out.println("          `//'`   `||`");
				System.out.println("         _//       ||");
				System.out.println(" .-\"-._,(__)     .(__).-\"\"-.");
				System.out.println("/          \\    /           \\");
				System.out.println("\\          /    \\           /");
				System.out.println(" `'-------`      `--------'`");
			}

			else if(piece2.equals("the simpsons")){
				System.out.println("                          (####)");
				System.out.println("                        (#######)");
				System.out.println("                      (#########)");
				System.out.println("                     (#########)");
				System.out.println("                    (#########)");
				System.out.println("                   (#########)");
				System.out.println("   __&__          (#########) ");
				System.out.println("  /     \\        (#########)   |\\/\\/\\/|     /\\ /\\  /\\               /\\");
				System.out.println(" |       |      (#########)    |      |     | V  \\/  \\---.    .----/  \\----.");
				System.out.println(" |  (o)(o)       (o)(o)(##)    |      |      \\_        /       \\          /");
				System.out.println(" C   .---_)    ,_C     (##)    | (o)(o)       (o)(o)  <__.   .--\\ (o)(o) /__.");
				System.out.println("  | |.___|    /___,   (##)     C      _)     _C         /     \\     ()     /");
				System.out.println("  |  \\__/       \\     (#)       | ,___|     /____,   )  \\      >   (C_)   <");
				System.out.println("  /_____\\        |    |         |   /         \\     /----'    /___\\____/___\\");
				System.out.println(" /_____/ \\       OOOOOO        /____\\          ooooo             /|    |\\");
				System.out.println("/         \\     /      \\      /      \\        /     \\           /        \\");
			}
		
			else {
				System.out.println("Sorry, the piece you have selected is not available. Thank you for visiting the Ascii Museum. It is now closed.");
		    }
		}
		else if(exhibit.equals("nature")){
            System.out.println("~~~~ Nature Exhibit ~~~~");
			System.out.println("1. The Northern Lights");
			System.out.println("2. Sunset");
			System.out.println("Which piece would you like to view?");
			Scanner sc4 = new Scanner(System.in);
			String piece4 = sc4.nextLine();

			if (piece4.equals("the northern lights")){
                System.out.println("  ` : | | | |:  ||  :     `  :  |  |+|: | : : :|   .        `              .");
                System.out.println("      ` : | :|  ||  |:  :    `  |  | :| : | : |:   |  .                    :");
                System.out.println("         .' ':  ||  |:  |  '       ` || | : | |: : |   .  `           .   :.");
                System.out.println("                `'  ||  |  ' |   *    ` : | | :| |*|  :   :               :|");
                System.out.println("        *    *       `  |  : :  |  .      ` ' :| | :| . : :         *   :.||");
                System.out.println("             .`            | |  |  : .:|       ` | || | : |: |          | ||");
                System.out.println("      '          .         + `  |  :  .: .         '| | : :| :    .   |:| ||");
                System.out.println("         .                 .    ` *|  || :       `    | | :| | :      |:| |");
                System.out.println(" .                .          .        || |.: *          | || : :     :|||");
                System.out.println("        .            .   . *    .   .  ` |||.  +        + '| |||  .  ||`");
                System.out.println("     .             *              .     +:`|!             . ||||  :.||`");
                System.out.println(" +                      .                ..!|*          . | :`||+ |||`");
                System.out.println("     .                         +      : |||`        .| :| | | |.| ||`     .");
                System.out.println("       *     +   '               +  :|| |`     :.+. || || | |:`|| `");
                System.out.println("                            .      .||` .    ..|| | |: '` `| | |`  +");
                System.out.println("  .       +++                      ||        !|!: `       :| |");
                System.out.println("              +         .      .    | .      `|||.:      .||    .      .    `");
                System.out.println("          '                           `|.   .  `:|||   + ||'     `");
                System.out.println("  __    +      *                         `'       `'|.    `:");
                System.out.println("\"'  `---\"\"\"----....____,..^---`^``----.,.___          `.    `.  .    ____,.,-");
                System.out.println("    ___,--'\"\"`---\"'   ^  ^ ^        ^       \"\"\"'---,..___ __,..---\"\"'");
                System.out.println("--\"'                           ^                         ``--..,__ "); 
            }

			else if(piece4.equals("sunset")){
                System.out.println("              ,.  _~-.,               .");
                System.out.println("           ~'`_ \\/,_. \\_");
                System.out.println("          / ,\"_>@`,__`~.)             |           .");
                System.out.println("          | |  @@@@'  \",! .           .          '");
                System.out.println("          |/   ^^@     .!  \\          |         /");
                System.out.println("          `' .^^^     ,'    '         |        .             .");
                System.out.println("           .^^^   .          \\                /          .");
                System.out.println("          .^^^       '  .     \\       |      /       . '");
                System.out.println(".,.,.     ^^^             ` .   .,+~'`^`'~+,.     , '");
                System.out.println("&&&&&&,  ,^^^^.  . ._ ..__ _  .'             '. '_ __ ____ __ _ .. .  .");
                System.out.println("%%%%%%%%%^^^^^^%%&&;_,.-=~'`^`'~=-.,__,.-=~'`^`'~=-.,__,.-=~'`^`'~=-.,");
                System.out.println("&&&&&%%%%%%%%%%%%%%%%%%&&;,.-=~'`^`'~=-.,__,.-=~'`^`'~=-.,__,.-=~'`^`'~=");
                System.out.println("%%%%%&&&&&&&&&&&%%%%&&&_,.;^`'~=-.,__,.-=~'`^`'~=-.,__,.-=~'`^`'~=-.,__,");
                System.out.println("%%%%%%%%%&&&&&&&&&-=~'`^`'~=-.,__,.-=~'`^`'~=-.,__,.-==--^'~=-.,__,.-=~'");
                System.out.println("##mjy#####*\"'");
                System.out.println("_,.-=~'`^`'~=-.,__,.-=~'`^`'~=-.,__,.-=~'`^`'~=-.,.-=~'`^`'~=-.,__,.-=~'");
                System.out.println(" ");
                System.out.println("~`'^`'~=-.,__,.-=~'`^`'~=-.,__,.-=~'`^`'~=-.,__,.-=~'`^`'~=-.,__,.-=~'`^");
			}

			else {
				System.out.println("Sorry, the piece you have selected in not available. Thank you for visiting the Ascii Museum. It is now closed.");
			}		
	    }
		else {
			System.out.println("Sorry, the exhibit you have selected is not available. Thank you for visiting the Ascii Museum. It is now closed.");
		}
	    
    }
}

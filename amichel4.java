/* Andrew Michel
csc321
lab#4
*/

import java.util.Scanner;
public class amichel3
{
	public static void main(String[] args)
        {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Choose one of the following 4 options:");
		System.out.println("1: Joke");
		System.out.println("2: Quote");
		System.out.println("3: Saying");
	        System.out.println("4: Toungue Twister\n");

	        int x = keyboard.nextInt();

	        switch (x)
	        {
	        case 1:
	        	System.out.println("What do you call a noodle? An impasta");
	        	break;
	        case 2:
	        	System.out.println("Part of the journey is the end - Tony Stark");
	        	break;
	        case 3:
	        	System.out.println("The early bird gets the worm");
	        	break;
	        case 4:
	        	System.out.println("How much wood would a woodchuck chuck if a woodchuck could chuck wood");
	        	break;
	        }
	}
}

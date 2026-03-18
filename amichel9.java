//Andrew Michel
//CSC321
//Lab#9
import java.util.Random;
import java.util.Scanner;
public class amichel9
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int x = 0;
		int usernum = 0;
		int num = rand.nextInt(20)+1 ;

		while(usernum != num)
		{
			System.out.println("Guess a number between 1-20:");
			usernum = keyboard.nextInt();

			if(usernum > 20 || usernum < 1)
			{
				System.out.println("Your number is not in the range 1-20");
			}
			else if(usernum > num)
			{
				System.out.println("Your Lost!! Your guess was higher than my number");
			}
			else if(usernum < num)
			{
				System.out.println("Your lost!! Your guess was lower than my number");
			}
			x++;
		}
		for(int i = 0; i<num; i++)
		{
			System.out.println("Congragulations!! You Win!!");
		}

	}
}

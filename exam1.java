//Andrew Michel
//CSC 321
//Midterm Exam#1

import java.util.Scanner;
public class exam1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int x = 14;
		System.out.println("Guess the number I am thinking of between 10-20: ");
		int y = keyboard.nextInt();

		if(y>x)
		{
			System.out.println("You LOSEEE!! your guess was higher than mine.");
		}
		else if (y<x)
		{
			System.out.println("YOU LOSEE!!! your guess was lower than mine.");
		}
		else if(x==y)
		{
			System.out.println("CONGRAGTULATIONS!! you guess the correct number");
		}





	}
}

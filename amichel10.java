//Andrew Michel
//CSC321
//Lab#10
import java.util.Scanner;

public class amichel10
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double height = 0;
		double radius = 0;

		System.out.println("Enter the height:");
		height = keyboard.nextDouble();

		System.out.println("Enter the radius:");
		radius = keyboard.nextDouble();

		double cylinderVolume = volume(radius, height);
		System.out.print("The volume is "+ cylinderVolume);

	}

	public static double volume(double x, double y)
	{
	       	double vol = 3.14*x*x*y;
		return vol;
	}
}


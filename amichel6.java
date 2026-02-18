// Andrew Michel
// Lab #6
// CSC 321

public class amichel6
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 6;
		
		int total1 = x+y*x/y-x;
		int total2 = -x-y/x*y+x;
		int total3 = x+y-x/y;
		
		double total4 = x+y*x/y-x;
		double total5 = -x-y/x*y+x;
		double total6 = x+y-x/y;

		System.out.println("Integer Total 1: " + total1);
                System.out.println("Integer Total 2: " + total2);
                System.out.println("Integer Total 3: " + total3);

                System.out.println("\nDouble Total 1: " + total4);
                System.out.println("Double Total 2: " + total5);
                System.out.println("Double Total 3: " + total6);

	}
}


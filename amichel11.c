//Andrew Michel
//CSC321
//Lab#11

#include<stdio.h>
#include<stdlib.h>
#include<math.h>

double hypotenuse(double base, double height);

int main()
{
	double base, height;
	
	printf("Enter the base of the triangle: \n");
	scanf("%lf",&base);

	printf("Enter the height of the triangle: \n");
	scanf("%lf", &height);

	double x = hypotenuse(base, height);

	printf("Hypotenuse: %.2lf\n",x);

	return EXIT_SUCCESS;
}
double hypotenuse(double base, double height)
{
	return sqrt((base*base)+(height*height));
}

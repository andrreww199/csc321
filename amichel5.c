//Andrew Michel
//CSC -321
//Lab #5


#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int i = 0;
	float b = 2.5f;
	char c = '!';
	double d = 50.5;

	printf("Addrress = %p, Integer: value = %d\n",&i,i);
	printf("Addrress = %p, Float: salue = %f\n",&b,b);
	printf("Addrress = %p, Char: value = %c\n",&c,c);
	printf("Addrress = %p, Double: value = %lf\n",&d,d);

//	if(i>2)
//	{
//		int x = 10;
//	}	
//	printf("Value: %d",x);	

	int array[10] = {0,1,2,3,4,5,6,7,8,9};

	for(i = 0; i < 9; i++)
	{
		printf("Address of array[%d] = %p\n",i ,&array[i]);
	}
	return EXIT_SUCCESS;
}

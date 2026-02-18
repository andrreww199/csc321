//Andrew Michel
//Lab #6
//CSC 321

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int x = 5;
        int y = 6;

        int total1 = x+y*x/y-x;
        int total2 = -x-y/x*y+x;
        int total3 = x+y-x/y;

        double total4 = x+y*x/y-x;
        double total5 = -x-y/x*y+x;
        double total6 = x+y-x/y;

        printf("Integer total 1: %d \n",total1);
        printf("Integer total 2: %d \n",total2);
        printf("Integer total 3: %d \n",total3);

        printf("\nDouble  total 1: %lf \n",total4);
        printf("Double  total 2: %lf \n",total5);
        printf("Double  total 3: %lf \n",total6);
	return EXIT_SUCCESS;
}

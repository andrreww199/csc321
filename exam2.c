//Andrew Michel
//CSC321
//Exam#2

#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void nameLoop(int x);

int main()
{
	int num;
	printf("Enter a number: \n");
	scanf("%d",&num);
	nameLoop(num);

	return EXIT_SUCCESS;
}

void nameLoop(int x)
{
	for(int i = 0; i < 6; i++)
	{
		printf("Andrew%d\n",x);
	}
	return;
}

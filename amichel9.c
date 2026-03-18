//Andrew Michel
//CSC321
//Lab#9

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void)
{
	srand(time(NULL));
	int x = 0;
	int usernum = 0;
	int num = 1 + rand() %20;

	while(usernum != num)
	{
		printf("Guess a number between 1-20:\n");
		scanf("%d",&usernum);

		if(usernum > 20 || usernum < 1)
		{
			printf("Your number is not in the range 1-20\n");
		}
		else if(usernum> num)
		{
			printf("You lost! Your guess was higher than my numebr\n");
		}
		else if(usernum< num)
		{
			printf("You lost! Your guess was lower than my number\n");
		}
		x++;
	}

	for(int i = 0; i<num; i++)
	{
		printf("Congragulations!! You win\n");
	}
	return EXIT_SUCCESS;
}


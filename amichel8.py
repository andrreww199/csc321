#Andrew Michel
#Lab 8
#CSC 321

userinput = int( input("Guess the number im thinking of 0-9: "))

if(userinput == 6):
    print("Congragualtions!!! You guess the correct number.")
elif(userinput < 6):
    print("You lose!!! Your number was less than the number I was thinking of.")
elif(userinput > 6):
    print("You lose!!! Your number was greater than the number I was thinking of.")

for i in range(5):
    print("Actions speak louder than words")

x = 4
while(x>0):
    print("Burritos")
    x = x - 1

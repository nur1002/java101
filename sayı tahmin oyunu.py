#sayı tahmin oyunu:


import random


def guess_number():
    target_number = random.randint(1, 100)

    print("Welcome to our word guessing game ")

    while True:

            guess=int(input("Guess a number between 1 and 100"))
            if guess == target_number:
                print("Congratulations! You guessed the number correctly!")
                break
            elif guess > target_number:
                print("less low")
            else:
                print("greater high")

guess_number()







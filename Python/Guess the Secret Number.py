#My First Python Game: Guess the Number!
print("==================================")
print("     WELCOME TO MY NUMBER GAME     ")
print("==================================")

# Ask the user for their name
player_name = input("What is your player name? ")
print(f"Nice to meet you, {player_name}! Let's play.\n")

# The secret number
secret_number = 7

# Get a guess from the user
guess = int(input("Guess a number between 1 and 10: "))

# Check if the guess is correct
if guess == secret_number:
    print("Wow, you got it right on the first try!")
elif guess > secret_number:
    print("Oops, too high! The secret number was 7.")
else:
    print("Oops, too low! The secret number was 7.")

print("\nThanks for playing my first Python script!")

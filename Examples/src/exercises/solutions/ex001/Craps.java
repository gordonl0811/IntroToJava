package exercises.solutions.ex001;

import exercises.solutions.ex000.Dice;

public class Craps {

  public static void main(String[] args) {

    // Check if the correct number of arguments were given
    if (args.length != 1) {
      System.out.println("Expected 1 argument, received " + args.length);
      return; // Exit the function early
    }

    int guess = Integer.parseInt(args[0]);

    // Check if the user input is between 2 and 12, because anything else is silly
    if (guess > 12 || guess < 2) {
      System.out.println("Expected a guess between 2 and 12, received " + guess);
      return; // Exit the function early
    }

    // Start the game

    System.out.println("User guessed: " + guess);

    Dice diceOne = new Dice();
    Dice diceTwo = new Dice();

    // Create two Dice. Creating just one and rolling twice will result
    // in the same functionality, but does it reflect the specification?
    diceOne.roll();
    diceTwo.roll();

    System.out.println("First dice roll: " + diceOne.getTop());
    System.out.println("Second dice roll: " + diceTwo.getTop());

    // Calculate and report the sum of the Dice
    int sum = diceOne.getTop() + diceTwo.getTop();
    System.out.println("Total: " + sum);

    if (guess == sum) {
      System.out.println("You win!");
    } else {
      System.out.println("You lose!");
    }

  }

}

package examples.tools;

public class GuessTheNumber {

  public static void main(String[] args) {

    int guess = Integer.parseInt(args[0]);
    Dice dice = new Dice();

    System.out.println("Guessed: " + guess);
    System.out.println("Rolling...");

    dice.roll();

    System.out.println("Rolled: " + dice.getTop());

    if (dice.getTop() != guess) {
      System.out.println("Incorrect :(");
    } else {
      System.out.println("Correct! :)");
    }

  }

}
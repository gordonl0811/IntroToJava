package exercises.solutions.ex002;

import java.util.Random;

public class ImprovedDice {

  private int top; // Value of the top face
  private final int sides; // Number of sides that the dice has
  private final Random generator; // Object that produces random numbers

  static final int STANDARD_DICE_SIDES = 6;

  // If no parameters are given, this constructor assumes
  // that you're creating a Dice with 6 sides
  public ImprovedDice() {
    this(STANDARD_DICE_SIDES);
  }

  public ImprovedDice(int sides) {
    this.sides = sides;
    generator = new Random();
    roll();
  }

  // Rolls the dice, setting the top value to a random integer between 1 and 6
  public void roll() { // Rolls dice
    top = generator.nextInt(sides) + 1;
  }

  // Returns the value on the top of the dice
  public int getTop() { // Returns number on top of dice
    return top;
  }

}

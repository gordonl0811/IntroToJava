package exercises.solutions.ex000;

import java.util.Random;

public class Dice {

  private int top; // Value of the top face
  private final Random generator; // Object that produces random numbers

  static final int SIDES = 6;
  static final int SUM_OF_SIDES = 7;

  public Dice() {
    this.generator = new Random();
    roll();
  }

  // Rolls the dice, setting the top value to a random integer between 1 and 6
  public void roll() { // Rolls dice
    top = generator.nextInt(SIDES) + 1;
  }

  // Returns the value on the top of the dice
  public int getTop() { // Returns number on top of dice
    return top;
  }

  // Returns the value on the bottom of the dice
  public int getBottom() { // Returns number on bottom of dice
    return SUM_OF_SIDES - getTop();
  }

}


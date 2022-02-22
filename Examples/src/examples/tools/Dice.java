package examples.tools;

import java.util.Random;

class Dice {

  int top; // Value of the top face
  Random generator; // Object that produces random numbers

  static final int SIDES = 6;
  static final int SUM_OF_SIDES = 7;

  Dice() {
    generator = new Random();
    roll();
  }

  void roll() { // Rolls dice
    top = generator.nextInt(SIDES) + 1;
  }

  int getTop() { // Returns number on top of dice
    return top;
  }

  int getBottom() { // Returns number on bottom of dice
    return SUM_OF_SIDES - getTop();
  }

}

package exercises.solutions.ex006.lotterysimulators;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSimulator implements NationalLotterySimulator {

  private final Random rng;
  public static int NORMAL_LOTTO_NUMBERS = 6;
  public static final int LOTTO_RANGE = 49;

  public LottoSimulator() {
    this.rng = new Random();
  }

  @Override
  public void simulate() {

    Set<Integer> chosenNumbers = new HashSet<>();

    // Generate first set of lotto numbers
    for (int i = 0; i < NORMAL_LOTTO_NUMBERS; i++) {

      // Keep searching for numbers that haven't been generated
      while (true) {

        int num = rng.nextInt(LOTTO_RANGE) + 1;

        // Print out the number if it hasn't been generated already
        if (!chosenNumbers.contains(num)) {
          chosenNumbers.add(num);
          System.out.println("Number " + i + ": " + num);
          break;
        }

      }
    }

    /* THIS CODE IS HEAVILY DUPLICATED ON PURPOSE, SEE QUESTION 007 */
    while (true) {
      // Generate the bonus number
      int num = rng.nextInt(LOTTO_RANGE) + 1;

      // Print out the number if it hasn't been generated already
      if (!chosenNumbers.contains(num)) {
        chosenNumbers.add(num);
        System.out.println("Bonus Number: " + num);
        break;
      }
    }
  }

}

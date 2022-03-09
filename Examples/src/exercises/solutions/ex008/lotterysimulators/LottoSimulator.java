package exercises.solutions.ex008.lotterysimulators;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSimulator implements NationalLotterySimulator {

  private final Random rng;
  private final Set<Integer> chosenNumbers;
  public static int NORMAL_LOTTO_NUMBERS = 6;
  public static final int LOTTO_RANGE = 49;

  public LottoSimulator() {
    this.rng = new Random();
    this.chosenNumbers = new HashSet<>();
  }

  @Override
  public void simulate() {

    chosenNumbers.clear();

    // Generate first set of lotto numbers
    for (int i = 0; i < NORMAL_LOTTO_NUMBERS; i++) {
      System.out.println("Number " + (i+1) + ": " + generateUniqueNumber());
    }

    // Generate the bonus number
    System.out.println("Bonus Number: " + generateUniqueNumber());
  }

  // Generates a number that hasn't been picked yet, stores it, and returns it
  private int generateUniqueNumber() {

    int num;

    do {
      num = rng.nextInt(LOTTO_RANGE) + 1;
    } while (!chosenNumbers.add(num));

    return num;
  }

}

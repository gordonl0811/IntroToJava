package exercises.solutions.ex008;

import exercises.solutions.ex008.lotterysimulators.LottoSimulator;
import exercises.solutions.ex008.lotterysimulators.NationalLotterySimulator;

public class Main {

  public static void main(String[] args) {
    NationalLotterySimulator simulator = new LottoSimulator();
    simulator.simulate();
  }
}

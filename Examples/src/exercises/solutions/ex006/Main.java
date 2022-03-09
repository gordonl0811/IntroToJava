package exercises.solutions.ex006;

import exercises.solutions.ex006.lotterysimulators.LottoSimulator;
import exercises.solutions.ex006.lotterysimulators.NationalLotterySimulator;

public class Main {

  public static void main(String[] args) {
    NationalLotterySimulator simulator = new LottoSimulator();
    simulator.simulate();
  }
}

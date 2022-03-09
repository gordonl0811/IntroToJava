package exercises.solutions.ex007;

import exercises.solutions.ex007.lotterysimulators.LottoSimulator;
import exercises.solutions.ex007.lotterysimulators.NationalLotterySimulator;

public class Main {

  public static void main(String[] args) {
    NationalLotterySimulator simulator = new LottoSimulator();
    simulator.simulate();
  }
}

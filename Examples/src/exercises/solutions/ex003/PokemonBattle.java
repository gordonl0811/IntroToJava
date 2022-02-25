package exercises.solutions.ex003;

public class PokemonBattle {

  public static int DEFAULT_DAMAGE = 20;

  public PokemonBattle() {}

  // Writing System.out.println really is tedious...
  // This helper function makes it easier to read
  // the code in the bulkier methods
  private void log(String message) {
    System.out.println(message);
  }


  public void battle(Pokemon first, Pokemon second) {

    log("The two Pokémon are:");
    log(first.getName() + ": " + first.getAttack() + " Attack, " + first.getHp() + " HP");
    log(second.getName() + ": " + second.getAttack() + " Attack, " + second.getHp() + " HP");

    int roundCount = 0;

    while (true) {
      roundCount++;

      log("");
      log("---- ROUND " + roundCount + "----");
      log("");

      int firstAttackDamage = first.calculateAttackDamage();
      int secondAttackDamage = second.calculateAttackDamage();

      // Work out who loses HP and report who attacks
      if (firstAttackDamage > secondAttackDamage) {
        second.loseHp(DEFAULT_DAMAGE);
        log(first.getName() + " attacks " + second.getName() + "!");
      } else if (firstAttackDamage < secondAttackDamage) {
        first.loseHp(DEFAULT_DAMAGE);
        log(second.getName() + " attacks " + first.getName() + "!");
      } else {
        log("Both Pokémon cancel each other out!");
      }

      // Report the end of round stats
      log("");
      log("End of round stats:");
      log(first.getName() + ": " + first.getHp() + " HP");
      log(second.getName() + ": " + second.getHp() + " HP");
      log("");

      // Finish the battle if a winner has been found
      if (first.hasFainted() || second.hasFainted()) {

        log("---- BATTLE OVER ----");

        // This will look bizarre if you haven't seen it before.
        // You can read about it below!
        // https://www.geeksforgeeks.org/java-ternary-operator-with-examples/
        Pokemon winner = first.hasFainted() ? second : first;

        log("");
        log(winner.getName() + " wins with " + winner.getHp() + " HP left!");
        return;
      }
    }
  }
}

package exercises.solutions.ex003;

import exercises.solutions.ex000.Dice;

public class Pokemon {

  private final String name;
  private final int attack;
  private int hp; // HP is the only attribute that changes - everything else is constant!
  private final Dice diceOne;
  private final Dice diceTwo;

  public Pokemon(String name, int attack, int hp) {
    this.name = name;
    this.attack = attack;
    this.hp = hp;
    this.diceOne = new Dice();
    this.diceTwo = new Dice();
  }

  public String getName() {
    return name;
  }

  public int getAttack() {
    return attack;
  }

  public int getHp() {
    return hp;
  }

  public void loseHp(int hp) {
    // In this scenario we MUST use "this" because the
    // parameter's identifier is the same as our attribute.
    this.hp = Math.max(this.hp - hp, 0);
  }

  public int calculateAttackDamage() {
    // As discussed in 001, we could just use one Dice and roll it twice.
    // However, this design choice reflects the specification more closely.
    diceOne.roll();
    diceTwo.roll();
    return attack + diceOne.getTop() + diceTwo.getTop();
  }

  public boolean hasFainted() {
    // I could just check if HP is 0 instead, but this ensures
    // that the functionality is still there if a mistake is made
    // in a future re-implementation of another method
    return hp <= 0;
  }
}

package exercises.solutions.ex003;

public class Main {

  public static void main(String[] args) {
    Pokemon pikachu = new Pokemon("Pikachu", 6, 15);
    Pokemon ditto = new Pokemon("Ditto", 4, 80);

    PokemonBattle pokemonBattle = new PokemonBattle();
    pokemonBattle.battle(pikachu, ditto);
  }

}

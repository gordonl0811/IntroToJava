package exercises.solutions.ex004.menu;

public class Salad implements MenuItem {

    public Salad() {}

    @Override
    public int price() {
        return 0;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

}

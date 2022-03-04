package exercises.solutions.ex004.menu;

public class Fries implements MenuItem {

    public Fries() {}

    @Override
    public int price() {
        return 1;
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }

}

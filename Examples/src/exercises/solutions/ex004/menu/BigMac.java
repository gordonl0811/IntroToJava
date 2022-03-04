package exercises.solutions.ex004.menu;

public class BigMac implements MenuItem {

    public BigMac() {}

    @Override
    public int price() {
        return 3;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }
}

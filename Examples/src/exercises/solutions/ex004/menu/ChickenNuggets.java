package exercises.solutions.ex004.menu;

public class ChickenNuggets implements MenuItem {

    public ChickenNuggets() {}

    @Override
    public int price() {
        return 2;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

}

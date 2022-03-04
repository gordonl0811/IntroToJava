package exercises.solutions.ex004;

import exercises.solutions.ex004.menu.BigMac;
import exercises.solutions.ex004.menu.ChickenNuggets;
import exercises.solutions.ex004.menu.Fries;
import exercises.solutions.ex004.menu.Salad;

public class Main {
    public static void main(String[] args) {
        BigMac burger = new BigMac();
        Fries fries = new Fries();
        ChickenNuggets nuggets = new ChickenNuggets();
        Salad salad = new Salad();

        int totalPrice = burger.price() + fries.price() + nuggets.price() + salad.price();

        System.out.println("The price of a Big Mac, fries, chicken nuggets, and a salad is £" + totalPrice);
    }
}

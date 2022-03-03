package examples.household;

import examples.household.animals.*;

import java.util.ArrayList;
import java.util.List;

public class Household {

    List<Animal> members;

    public Household() {
        this.members = new ArrayList<>();
    }

    public void addHouseholdMember(Animal member) {
        members.add(member);
    }

    public void greetEverybody() {
        for (Animal member : members) {
            member.greet();
        }
    }

    public static void main(String[] args) {

        Household household = new Household();

        Human mum = new Human("Mum", 40);
        Human dad = new Human("Dad", 40);
        Human me = new Human("Gordon", 21);
        Cat cat = new Cat();
        Dog dog = new Dog();

        household.addHouseholdMember(mum);
        household.addHouseholdMember(dad);
        household.addHouseholdMember(me);
        household.addHouseholdMember(cat);
        household.addHouseholdMember(dog);

        household.greetEverybody();
    }
}

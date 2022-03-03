package examples.household.animals;

public class Human implements Animal {

    private final String name;
    private final int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void greet() {
        System.out.println("Hi! I'm " + name);
    }

    public void sayAge() {
        System.out.println("I'm " + age + " years old!");
    }
}

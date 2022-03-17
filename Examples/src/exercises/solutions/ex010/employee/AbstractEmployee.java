package exercises.solutions.ex010.employee;

public abstract class AbstractEmployee implements Employee {

    protected String id;
    protected int salary;

    public AbstractEmployee(String id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public abstract int calculateBonus();
}

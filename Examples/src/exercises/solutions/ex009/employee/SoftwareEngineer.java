package exercises.solutions.ex009.employee;

public class SoftwareEngineer extends AbstractEmployee {

    public SoftwareEngineer(String id, int salary) {
        super(id, salary);
    }

    @Override
    public int calculateBonus() {
        return (int) (salary * 0.1);
    }
}

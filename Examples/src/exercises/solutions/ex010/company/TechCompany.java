package exercises.solutions.ex010.company;

import exercises.solutions.ex010.employee.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * This implementation uses a List of all its employees.
 * However, since we know that the Employee ID is unique
 * we could actually use a Map<String,Employee> (like a Python dict)
 * to store the employees in the company. This will also make
 * employeeCompensation a lot more efficient!
 *
 * Look up how Map and HashMap works via Google :)
 */
public class TechCompany implements Company {

    private final List<Employee> employees;

    public TechCompany() {
        this.employees = new ArrayList<>();
    }

    @Override
    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public int employeeCompensation(String id) {

        for (Employee employee : employees) {

            // Check if the employee has the same ID
            if (employee.getId().equals(id)) {
                return employee.getSalary() + employee.calculateBonus();
            }

        }

        // Return -1 if the compensation wasn't found
        return -1;
    }

    @Override
    public int annualCost() {
        int total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary() + employee.calculateBonus();
        }
        return total;
    }
}

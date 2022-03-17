package exercises.solutions.ex010.company;

import exercises.solutions.ex010.employee.Employee;

public interface Company {

    // Adds an employee to the company's list of employees
    void hireEmployee(Employee employee);

    // Searches for an employee and returns the sum of their salary and bonus
    // Returns -1 if the employee can't be found
    int employeeCompensation(String id);

    // Returns the total cost of the company's employees for a year
    int annualCost();

}

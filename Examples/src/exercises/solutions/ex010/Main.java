package exercises.solutions.ex010;

import exercises.solutions.ex010.company.TechCompany;
import exercises.solutions.ex010.employee.ProductManager;
import exercises.solutions.ex010.employee.SoftwareEngineer;

public class Main {
    public static void main(String[] args) {

        // Create employees and the company
        SoftwareEngineer alice = new SoftwareEngineer("1", 40000);
        SoftwareEngineer bob = new SoftwareEngineer("2", 35000);
        ProductManager charlie = new ProductManager("3", 45000, 4);

        TechCompany microsoft = new TechCompany();

        // Add employees
        microsoft.hireEmployee(alice);
        microsoft.hireEmployee(bob);
        microsoft.hireEmployee(charlie);

        // Check total compensations
        System.out.println(microsoft.employeeCompensation("1"));
        System.out.println(microsoft.employeeCompensation("2"));
        System.out.println(microsoft.employeeCompensation("3"));

        // Check total
        System.out.println(microsoft.annualCost());
    }
}

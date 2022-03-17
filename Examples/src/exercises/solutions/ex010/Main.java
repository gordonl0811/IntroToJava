package exercises.solutions.ex010;

import exercises.solutions.ex010.company.TechCompany;
import exercises.solutions.ex010.employee.ProductManager;
import exercises.solutions.ex010.employee.SoftwareEngineer;

public class Main {
    public static void main(String[] args) {
        SoftwareEngineer alice = new SoftwareEngineer("1", 40000);
        SoftwareEngineer bob = new SoftwareEngineer("2", 35000);
        ProductManager charlie = new ProductManager("3", 45000, 4);

        TechCompany microsoft = new TechCompany();

        microsoft.hireEmployee(alice);
        microsoft.hireEmployee(bob);
        microsoft.hireEmployee(charlie);

        System.out.println(microsoft.annualCost());
    }
}

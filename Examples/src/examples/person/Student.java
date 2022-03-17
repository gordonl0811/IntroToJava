package examples.person;

public class Student extends Person {

  private final int year;

  public Student(String fname, String lname, int year) {
    super(fname, lname);
    this.year = year;
  }

  public void greet() {
    System.out.println("I'm a student called " + fname + " " + lname + " in Year " + year + "!");
  }
}

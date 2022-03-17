package examples.person;

public class Person {

  protected final String fname;
  protected final String lname;

  public Person(String fname, String lname) {
    this.fname = fname;
    this.lname = lname;
  }

  public void printName() {
    System.out.println(fname + " " + lname);
  }
}

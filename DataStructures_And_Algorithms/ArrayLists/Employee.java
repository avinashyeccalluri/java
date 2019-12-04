/**
 * Employee
 */
public class Employee {

  private String firstName;
  private String lastName;
  private int id;

  public Employee(String firstName,String lastName,int id) {
    this.firstName=firstName;
    this.lastName=lastName;
    this.id=id;
  }

  

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Employee{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", id=" + id +
            '}';
  }
}
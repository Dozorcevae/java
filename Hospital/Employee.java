//Employee.java
package Hospital;

public abstract class Employee extends Person {
    protected String position;
    protected double salary;

    
    public Employee(String firstName, String lastName, String position, double salary) {
        super(firstName, lastName, "E");
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public double getSalary() { return salary; }
    public void setSalary(double money) { this.salary = money; }

    
}

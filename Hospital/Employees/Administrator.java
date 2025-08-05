//Administrator.java
package Hospital.Employees;

import Hospital.Employee;

public class Administrator extends Employee {

    private int adminLevel;


    public Administrator(String firstName, String lastName, double salary) {
        super(firstName, lastName, "Administrator", salary);
        this.adminLevel = 1; // Default admin level
    }

    public int getAdminLevel() { return adminLevel; }
    public void setAdminLevel(int adminLevel) { this.adminLevel = adminLevel; }
    @Override
    public String toString() {
    
        return "Administrator{" +
                "Name=" + this.getFullName() +
                ", ID=" + this.getId() +
                ", Position='" + this.getPosition() + '\'' +
                ", Salary=" + this.getSalary() +
                '}';
    }
}

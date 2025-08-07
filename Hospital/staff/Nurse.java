//Nurse.java
package Hospital.staff;

import Hospital.core.*;


public class Nurse extends Employee {
    private String department;
    
    public Nurse(String firstname, String lastname, String department, double salary){
        super(firstname, lastname, "Nurse", salary);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return "Nurse{" +
                "Name=" + this.getFullName() +  
                ", ID=" + this.getId() +
                ", Department='" + department + '\'' +
                ", Position='" + this.getPosition() + '\'' +
                ", Salary=" + this.getSalary() +
                '}';
    }
}

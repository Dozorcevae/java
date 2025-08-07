//Doctor.java
package Hospital.staff;

import Hospital.core.Employee;

public class Doctor extends Employee{
    private String specialty;

    public Doctor(String firstName, String lastName, String specialty, double salary) {
        super(firstName, lastName, "Doctor", salary);
        this.specialty = specialty;
    }

    public String getSpecialty() { return specialty; }

    public void setSpecialty(String specialty) { this.specialty = specialty; }

    @Override
    public String toString() {
        return "Doctor{" +
                "Name=" + this.getFullName() +
                ", ID=" + this.getId() +
                ", Specialty='" + specialty + '\'' +
                ", Salary=" + salary +
                '}';
    }
} 

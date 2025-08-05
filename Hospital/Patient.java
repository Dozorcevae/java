//Patient.java
package Hospital;

public class Patient extends Person {


    public Patient(String name, String surname) {
        super(name, surname, "P");
    }

    @Override
    public String toString() {
        return "Patient{" +
        "Name=" + this.getFullName() +
        ", ID=" + this.getId() +
        '}';
    }
}

//Appointment.java
package Hospital.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import Hospital.Clinic;
import Hospital.Employee;
import Hospital.Patient;

public class Appointment {
    private final String id;
    private final Patient patient;
    private final Employee doctor;
    private final LocalDateTime dateTime;

    public Appointment(Patient patient, Employee doctor, LocalDateTime dateTime) {
        this.id = Clinic.generateId("A");
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
    }

    public String getId() { return id; }
    public Patient getPatient() { return patient; }
    public Employee getDoctor() { return doctor; }
    public LocalDateTime getDateTime() { return dateTime; } 

    public String getFormattedDateTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return dateTime.format(formatter);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "ID='" + id + '\'' +
                ", Patient=" + patient.getFullName() +
                ", Doctor=" + doctor.getFullName() +
                ", DateTime=" + getFormattedDateTime() +
                '}';
    }
}

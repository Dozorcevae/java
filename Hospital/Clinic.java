//Clinic.java
package Hospital;

import java.time.LocalDateTime;

import Hospital.Employees.Doctor;
//import Hospital.Employees.Nurse;
import Hospital.Utils.Appointment;

public class Clinic {
    public static void main(String[] args) {
        Patient p = new Patient("Анна", "Иванова");
        Doctor d = new Doctor("Игорь", "Смирнов", "Терапевт", 50000);
        
        LocalDateTime dt = LocalDateTime.of(2025, 8, 10, 14, 30);
        Appointment appointment = new Appointment(p, d, dt);
        
        System.out.println(appointment);
    }

    public static String generateId(String prefix) {
        return prefix + System.nanoTime(); // Уникальнее, чем currentTimeMillis
    }
}
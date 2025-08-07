//Clinic.java
package Hospital;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Hospital.core.*;
import Hospital.staff.*;
import Hospital.util.*;


public class Clinic {
    public static void main(String[] args) {
        Patient patient = new Patient("Елена", "Иванова");
        MedicalRecord record = new MedicalRecord(patient.getId());

        visit firstVisit = new visit(
            LocalDate.of(2025, 8, 5),
            "Пациент жалуется на головную боль.",
            "Парацетамол 500мг 2 раза в день.",
            LocalDate.of(2025, 8, 12)
        );

        record.addVisit(firstVisit);

        // Вывести все посещения
        for (visit v : record.getVisits()) {
            System.out.println("Дата: " + v.getVisitDate());
            System.out.println("Назначения: " + v.getPrescriptions());
            System.out.println("Следующий визит: " + v.getNextVisitDate());
        }

    }
}
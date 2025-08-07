package Hospital.util;

import java.time.LocalDate;

public class visit {
    private LocalDate visitDate;
    private String doctorNotes;
    private String prescriptions;
    private LocalDate nextVisitDate;

    public visit(LocalDate date, String doctorNotes, String prescriptions, LocalDate nextVisitDate) {
        this.visitDate = date;
        this.doctorNotes = doctorNotes;
        this.prescriptions = prescriptions;
        this.nextVisitDate = nextVisitDate;
    }
    public LocalDate getVisitDate() { return visitDate; }
    public String getDoctorNotes() { return doctorNotes; }
    public String getPrescriptions() { return prescriptions; }
    public LocalDate getNextVisitDate() { return nextVisitDate; }

    public void setVisitDate(LocalDate visitDate) { this.visitDate = visitDate; }
    public void setDoctorNotes(String doctorNotes) { this.doctorNotes = doctorNotes; }
    public void setPrescriptions(String prescriptions) { this.prescriptions = prescriptions; }
    public void setNextVisitDate(LocalDate nextVisitDate) { this.nextVisitDate = nextVisitDate; }

}

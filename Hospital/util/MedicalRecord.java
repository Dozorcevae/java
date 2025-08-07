package Hospital.util;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {
    private final String pationtId;
    private final List<visit> visits = new ArrayList<>();

    public MedicalRecord(String pationtId) {
        this.pationtId = pationtId;
    }

    public void addVisit(visit visit) {
        visits.add(visit);
    }
    public List<visit> getVisits() {
        return new ArrayList<>(visits);
    }
    public String getPationtId() {
        return pationtId;
    }

}

import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {
    private String patientID;
    private String bloodType;
    private List<String> diagnoses;
    private List<String> treatments;

    public MedicalRecord(String patientID) {
        this.patientID = patientID;
        this.bloodType = "Unknown";
        this.diagnoses = new ArrayList<>();
        this.treatments = new ArrayList<>();
    }

    public void addDiagnosis(String diagnosis) {
        diagnoses.add(diagnosis);
    }

    @Override
    public String toString() {
        return "MedicalRecord [Patient ID=" + patientID + ", Blood Type=" + bloodType + ", Diagnoses=" + diagnoses + ", Treatments=" + treatments + "]";
    }
}

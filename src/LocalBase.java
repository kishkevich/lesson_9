import java.util.HashSet;

public interface LocalBase {
    void writeData(HashSet<Patient> patientsList);

    HashSet<Patient> readData();
}

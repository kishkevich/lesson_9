import java.io.IOException;
import java.util.HashSet;

public interface ListPatient {
    HashSet<Patient> getPatient() throws IOException;
}

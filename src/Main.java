import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //AddPatient patientFromConsole = new AddConsoleePatient();
        //patientFromConsole.inputPatient();
        //((AddConsoleePatient) patient).toStrinng();
        //patientFromConsole.toString();
        AddFromTxtFile listPatientFromTxt = new AddFromTxtFile();

        try {
            listPatientFromTxt.getPatient();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

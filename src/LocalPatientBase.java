import java.io.*;
import java.util.Date;
import java.util.HashSet;

public class LocalPatientBase implements LocalBase {
    private HashSet<Patient> offlineList = new HashSet<>();
    File file = new File("file.dat");

    @Override
    public void writeData(HashSet<Patient> patientsList) {
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(file, false))) {
            for (Patient patient : patientsList) {
                dataOut.writeUTF(patient.getFirstName());
                dataOut.writeUTF(patient.getLastName());
                dataOut.writeLong(patient.getBirthday().getTime());
                dataOut.writeBoolean(patient.isHealthy());
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public HashSet<Patient> readData() {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))) {
            while (dataInputStream.available() > 0) {
                String name = dataInputStream.readUTF();
                String secondName = dataInputStream.readUTF();
                Date birthday = new Date(dataInputStream.readLong());
                boolean stateOfHealth = dataInputStream.readBoolean();
                offlineList.add(new Patient(name, secondName, birthday, stateOfHealth));
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return offlineList;
    }
}

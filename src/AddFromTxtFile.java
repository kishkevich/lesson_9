import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class AddFromTxtFile {
private HashSet<Patient> list = new HashSet<>();
private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");



    public void getPatient() throws IOException{
        URL myURL = new URL ("https://github.com/kishkevich/Lesson9/blob/master/Patient.txt");
        HttpsURLConnection urlCon = (HttpsURLConnection) myURL.openConnection();
        DataInputStream inputStream = new DataInputStream(new FileInputStream(String.valueOf(urlCon)));
String surname = inputStream.readUTF();
String name = inputStream.readUTF();
String dateOfBirth = inputStream.readUTF();
boolean health = Boolean.parseBoolean(inputStream.readUTF());
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String str;
        while ((str =reader.readLine())!=null) {
            String[] array = str.split(";");
            String surname = array[array.length-1];
            String name = array[array.length-1];
           Date date = null;
            try {
                date = dateFormat.parse(array[array.length-1]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            boolean health = Boolean.valueOf(array[array.length-1]);
            list.add(new Patient(surname, name, date, health));

        }
        return list;*/
       System.out.println("Patient {" +
               "name: " + name +
               "; surname: " + surname+
               "; date of birth: " + dateOfBirth+
               "; health: " + health + " }");
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class OnlinePatientBase implements OnlineBase {
    private HashSet<Patient> onlineList = new HashSet<>();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public HashSet<Patient> getOnlineBase() {
        try {
            URL url1 = new URL("https://raw.githubusercontent.com/kishkevich/lesson_9/master/Patient.txt");
            HttpURLConnection UrlCon = (HttpURLConnection) url1.openConnection();
            InputStream inputStream = UrlCon.getInputStream();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String str;
                while ((str = br.readLine()) != null) {
                    String[] array = str.split(";");
                    String name = array[0];
                    String secondName = array[1];
                    Date date = sdf.parse(array[2]);
                    boolean healthy = Boolean.valueOf(array[3]);
                    onlineList.add(new Patient(name, secondName, date, healthy));
                }
            } catch (IOException | ParseException exc) {
                System.out.println(exc);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return onlineList;
    }
}

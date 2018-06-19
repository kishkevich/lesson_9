import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AddConsoleePatient implements AddPatient {
    private HashSet<Patient> list = new HashSet<>();
    private String name;
    private String surname;
    private String dateOfBirth;
    private boolean health;
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd.mm.yyyy");

  /*  @Override
    public HashSet<Patient> getPatient() throws IOException {
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        surname = scanner.nextLine();
        dateOfBirth = scanner.nextLine();
        Date date = null;
        try {
            date = formatDate.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        health = scanner.nextBoolean();
        //list.add(name);

       // List<String>arraySurName=Arrays.asList(surname.split(""));
       // List<String>arrayName=Arrays.asList(name.split(""));
        //List<String>arrayDate=Arrays.asList(dateOfBirth.split(""));
       // List<Boolean>arrayHealth=Arrays.asList(health.split(""));

        //list.add(new Patient(arraySurName, arrayName, arrayDate, health));
        return list;
    }

    public AddConsoleePatient (String surname,String name,  String dateOfBirth, boolean health){
        this.surname=surname;
        this.name=name;
        this.dateOfBirth = dateOfBirth;
        this.health=health;
    }
*/

    @Override
    public Patient inputPatient() {
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        surname = scanner.nextLine();
        dateOfBirth  =scanner.nextLine();
        try {
            Date date = formatDate.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        health = scanner.nextBoolean();

        return inputPatient() ;
    }


}

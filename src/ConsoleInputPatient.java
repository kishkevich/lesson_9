import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInputPatient implements InputPatient {
    private String firstName;
    private String lastName;
    private String birthday;
    private boolean healthy;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Patient addPatient() {
        try {
            System.out.println("Введите данные пациента:");
            Scanner scanner = new Scanner(System.in);
            firstName = scanner.nextLine();
            lastName = scanner.nextLine();
            birthday = scanner.nextLine();
            healthy = scanner.nextBoolean();
            Date date = sdf.parse(birthday);
            return new Patient(firstName, lastName, date, healthy);
        } catch (ParseException e) {
            System.out.println("Неверная дата рождения!");
            return addPatient();
        }
        catch (InputMismatchException e){
            System.out.println("Неверное состояние здоровья!");
            return addPatient();
        }
    }
}

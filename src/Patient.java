import java.util.Date;

public class Patient {
    private String name;
    private String surname;
    private Date  dateOfBirth;
    private boolean health;

    public Patient (String surname, String name, Date dateOfBirth, boolean health){
        this.surname=surname;
        this.name=name;
        this.dateOfBirth = dateOfBirth;
        this.health=health;
    }

    public String getName(){
        return name;
    }

    public String getSurname (){
        return surname;
    }

    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    public boolean getHealth(){
        return health;
    }

    public String toStrinng (){
        return "Patient {" +
                "name: " + name +
                "; surname: " + surname+
                "; date of birth: " + dateOfBirth+
                "; health: " + health + " }";
    }
}

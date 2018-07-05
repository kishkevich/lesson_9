import java.util.HashSet;

public class CurrentBase {
    private HashSet<Patient> list;

    public HashSet<Patient> getCurrentBase(){
        OnlinePatientBase onlinePatientBase = new OnlinePatientBase();
        LocalPatientBase localPatientBase = new LocalPatientBase();
        list = localPatientBase.readData();
        list.addAll(onlinePatientBase.getOnlineBase());
        return list;
    }
}

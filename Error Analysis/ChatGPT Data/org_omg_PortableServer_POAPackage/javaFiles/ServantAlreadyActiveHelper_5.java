import org.omg.PortableServer.POAPackage.ServantAlreadyActiveHelper;

public class ServantAlreadyActiveHelper_5 {
    public static void main(String[] args) {
        ServantAlreadyActiveHelper helper = new ServantAlreadyActiveHelper();
        String id = helper.id();
        System.out.println("Servant ID: " + id);
    }
}

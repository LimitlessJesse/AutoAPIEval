import java.util.HashMap;
import javax.management.remote.rmi.RMIConnector;

public class RMIConnector_1 {
    public static void main(String[] args) {
        try {
            RMIConnector connector = new RMIConnector(new HashMap());
            connector.connect();
            System.out.println("Connected to the remote MBean server");
        } catch (Exception e) {
            System.out.println("Error connecting to the remote MBean server: " + e.getMessage());
        }
    }
}

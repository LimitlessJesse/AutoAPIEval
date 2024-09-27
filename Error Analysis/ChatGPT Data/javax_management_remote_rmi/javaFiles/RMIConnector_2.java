import javax.management.remote.rmi.RMIConnector;

public class RMIConnector_2 {
    public static void main(String[] args) {
        RMIConnector connector = new RMIConnector(null);
        connector.close();
    }
}

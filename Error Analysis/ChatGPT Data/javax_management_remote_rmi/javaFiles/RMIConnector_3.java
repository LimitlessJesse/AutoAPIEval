import javax.management.remote.rmi.RMIConnector;

public class RMIConnector_3 {
    public static void main(String[] args) {
        RMIConnector rmiConnector = new RMIConnector();
        String connectionId = rmiConnector.getConnectionId();
        System.out.println("Connection ID: " + connectionId);
    }
}

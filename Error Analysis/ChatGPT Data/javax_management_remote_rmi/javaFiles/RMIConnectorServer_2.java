import javax.management.remote.rmi.RMIConnectorServer;

public class RMIConnectorServer_2 {
    public static void main(String[] args) {
        RMIConnectorServer server = new RMIConnectorServer();
        server.stop();
        System.out.println("RMIConnectorServer stopped successfully.");
    }
}

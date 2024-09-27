import javax.management.remote.rmi.RMIConnector;
import java.io.IOException;

public class RMIConnector_1 {
    public static void main(String[] args) {
        RMIConnector connector = new RMIConnector();
        try {
            connector.connect();
            System.out.println("Connection established successfully");
        } catch (IOException e) {
            System.err.println("Error connecting to the connector server: " + e.getMessage());
        }
    }
}

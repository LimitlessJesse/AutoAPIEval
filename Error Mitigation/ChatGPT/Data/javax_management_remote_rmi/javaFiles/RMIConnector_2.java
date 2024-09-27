import javax.management.remote.rmi.RMIConnector;

public class RMIConnector_2 {
    public static void main(String[] args) {
        RMIConnector connector = new RMIConnector();
        
        try {
            connector.close();
            System.out.println("Connection closed successfully");
        } catch (IOException e) {
            System.err.println("Error closing connection: " + e.getMessage());
        }
    }
}

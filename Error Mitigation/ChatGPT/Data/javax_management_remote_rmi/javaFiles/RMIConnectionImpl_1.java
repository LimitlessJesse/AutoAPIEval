import javax.management.remote.rmi.RMIConnectionImpl;

public class RMIConnectionImpl_1 {
    public static void main(String[] args) {
        RMIConnectionImpl rmiConnection = new RMIConnectionImpl();
        
        try {
            rmiConnection.close();
            System.out.println("RMI connection closed successfully");
        } catch (IOException e) {
            System.out.println("Error closing RMI connection: " + e.getMessage());
        }
    }
}

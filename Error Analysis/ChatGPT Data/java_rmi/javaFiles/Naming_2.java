import java.rmi.Naming;

public class Naming_2 {
    public static void main(String[] args) {
        try {
            // Replace "YourObjectName" and "YourRemoteObject" with actual names
            Naming.rebind("YourObjectName", new YourRemoteObject());
            System.out.println("Remote object rebound successfully");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

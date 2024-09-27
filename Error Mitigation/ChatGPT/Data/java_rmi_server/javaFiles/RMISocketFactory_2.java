import java.rmi.server.RMISocketFactory;
import java.net.Socket;

public class RMISocketFactory_2 {
    public static void main(String[] args) {
        RMISocketFactory factory = RMISocketFactory.getDefaultSocketFactory();
        try {
            Socket socket = factory.createSocket("localhost", 1099);
            System.out.println("Socket created: " + socket);
        } catch (Exception e) {
            System.out.println("Error creating socket: " + e.getMessage());
        }
    }
}

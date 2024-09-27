import java.net.NetworkInterface;
import java.net.SocketException;

public class NetworkInterface_3 {
    public static void main(String[] args) {
        try {
            NetworkInterface networkInterface = NetworkInterface.getByName("eth0");
            if (networkInterface != null) {
                boolean isInterfaceUp = networkInterface.isUp();
                System.out.println("Is interface up and running? " + isInterfaceUp);
            } else {
                System.out.println("Network interface not found.");
            }
        } catch (SocketException e) {
            System.out.println("SocketException occurred: " + e.getMessage());
        }
    }
}

import java.net.NetworkInterface;
import java.net.SocketException;

public class NetworkInterface_5 {
    public static void main(String[] args) {
        try {
            NetworkInterface networkInterface = NetworkInterface.getByName("eth0");
            if (networkInterface != null) {
                boolean isVirtual = networkInterface.isVirtual();
                System.out.println("Is virtual interface: " + isVirtual);
            } else {
                System.out.println("Network interface not found.");
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}

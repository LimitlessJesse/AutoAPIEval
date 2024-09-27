import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterface_5 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                boolean isInterfaceUp = networkInterface.isUp();
                System.out.println("Interface: " + networkInterface.getName() + " is up: " + isInterfaceUp);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}

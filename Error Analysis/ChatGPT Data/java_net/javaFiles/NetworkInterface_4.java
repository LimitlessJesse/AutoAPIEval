import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterface_4 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            int index = 0;
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                System.out.println("Index: " + index + " - Interface: " + networkInterface.getName());
                index++;
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}

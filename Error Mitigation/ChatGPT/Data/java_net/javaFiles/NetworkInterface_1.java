import java.net.NetworkInterface;
import java.util.Enumeration;

public class NetworkInterface_1 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                System.out.println("Network Interface Name: " + networkInterface.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

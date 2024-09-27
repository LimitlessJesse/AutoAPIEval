import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterface_3 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            int i = 0;
            while (interfaces.hasMoreElements()) {
                NetworkInterface netInterface = interfaces.nextElement();
                System.out.println(i + ": " + netInterface.getName());
                i++;
            }

            // Get the NetworkInterface by index
            int index = 0; // Set the index you want to get
            NetworkInterface netInterface = NetworkInterface.getByIndex(index);
            if (netInterface!= null) {
                System.out.println("NetworkInterface at index " + index + ": " + netInterface.getName());
            } else {
                System.out.println("No NetworkInterface at index " + index);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}

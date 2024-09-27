import java.net.NetworkInterface;

public class NetworkInterface_4 {
    public static void main(String[] args) {
        try {
            Class.forName("java.net.NetworkInterface");
            NetworkInterface netInterface = NetworkInterface.getByName("eth0");
            System.out.println(netInterface);
        } catch (ClassNotFoundException e) {
            System.out.println("NetworkInterface class not found");
        } catch (java.net.SocketException e) {
            e.printStackTrace();
        }
    }
}

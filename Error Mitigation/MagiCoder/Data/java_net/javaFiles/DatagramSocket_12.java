import java.net.*;

public class DatagramSocket_12 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");
            int port = 8080;
            socket.connect(address, port);
            System.out.println("Connected to " + address + " on port " + port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

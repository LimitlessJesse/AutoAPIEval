import java.net.*;

public class DatagramSocket_11 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");
            int port = 8080;
            SocketAddress socketAddress = new InetSocketAddress(address, port);
            socket.connect(socketAddress);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

import java.net.DatagramSocket;
import java.net.SocketAddress;

public class DatagramSocket_3 {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = new DatagramSocket();
        SocketAddress address = ...; // specify the address you want to connect to

        datagramSocket.connect(address);

        System.out.println("Datagram socket connected to: " + address);
    }
}

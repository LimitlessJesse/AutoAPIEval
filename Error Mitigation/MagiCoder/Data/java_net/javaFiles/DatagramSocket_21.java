import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocket_21 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.setTrafficClass(0x02); // Setting the traffic class to IPTOS_LOWCOST
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}

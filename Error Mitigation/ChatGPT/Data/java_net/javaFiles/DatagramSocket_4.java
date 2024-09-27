import java.net.DatagramSocket;

public class DatagramSocket_4 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.disconnect();
            System.out.println("Socket disconnected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

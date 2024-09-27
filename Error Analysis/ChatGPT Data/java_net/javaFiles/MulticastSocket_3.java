import java.net.MulticastSocket;

public class MulticastSocket_3 {
    public static void main(String[] args) {
        MulticastSocket multicastSocket = new MulticastSocket();
        multicastSocket.setTimeToLive(5);
        System.out.println("Time to live set to: " + multicastSocket.getTimeToLive());
    }
}

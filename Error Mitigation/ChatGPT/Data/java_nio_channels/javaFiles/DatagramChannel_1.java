import java.io.IOException;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_1 {
    public static void main(String[] args) {
        try {
            DatagramChannel datagramChannel = DatagramChannel.open();
            System.out.println("Datagram channel opened successfully");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}

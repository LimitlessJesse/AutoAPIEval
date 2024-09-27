import java.net.SocketException;
import java.net.DatagramSocketImpl;

public class DatagramSocketImpl_1 {
    public static void main(String[] args) {
        DatagramSocketImpl socketImpl = new DatagramSocketImpl() {
            @Override
            protected void create() throws SocketException {
                // Implementation of creating a datagram socket
                System.out.println("Datagram socket created");
            }
        };

        try {
            socketImpl.create();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}

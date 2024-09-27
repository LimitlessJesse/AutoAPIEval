import java.net.DatagramSocketImpl;

public class DatagramSocketImpl_5 {
    public static void main(String[] args) {
        try {
            DatagramSocketImpl socketImpl = new DatagramSocketImpl();
            socketImpl.close();
            System.out.println("DatagramSocketImpl closed successfully");
        } catch (Exception e) {
            System.out.println("Error while closing DatagramSocketImpl: " + e.getMessage());
        }
    }
}

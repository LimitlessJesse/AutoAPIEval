import java.net.Socket;
import java.net.SocketImpl;
import java.net.InetAddress;
import java.io.IOException;

public class SocketImpl_5 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            SocketImpl socketImpl = socket.getImpl();
            InetAddress inetAddress = socketImpl.getInetAddress();
            System.out.println("InetAddress: " + inetAddress.getHostAddress());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

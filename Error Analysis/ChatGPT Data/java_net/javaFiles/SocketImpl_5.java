import java.io.OutputStream;
import java.net.SocketImpl;

public class SocketImpl_5 {
    public static void main(String[] args) {
        SocketImpl socketImpl = new SocketImpl();
        try {
            OutputStream outputStream = socketImpl.getOutputStream();
            outputStream.write("Hello, World!".getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

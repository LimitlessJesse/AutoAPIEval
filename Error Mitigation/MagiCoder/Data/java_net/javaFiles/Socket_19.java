import java.net.*;
import java.io.*;

public class Socket_19 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        socket.setTcpNoDelay(true);
        socket.close();
    }
}

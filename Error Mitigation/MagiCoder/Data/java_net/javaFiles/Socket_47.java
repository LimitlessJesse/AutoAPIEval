import java.net.*;
import java.io.*;

public class Socket_47 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("www.example.com", 80);
        socket.setTrafficClass(IPTOS_LOWDELAY);
        socket.close();
    }
}

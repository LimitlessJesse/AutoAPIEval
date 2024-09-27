import java.net.*;
import java.io.*;

public class Socket_7 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("www.example.com", 80), 5000);
            System.out.println("Connected to the server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.net.Socket;
import java.io.IOException;

public class Socket_42 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.example.com", 80);
            socket.setPerformancePreferences(1, 0, 0);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

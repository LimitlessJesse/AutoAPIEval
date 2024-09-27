import java.net.*;
import java.io.*;

public class Socket_55 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.sendUrgentData(1);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

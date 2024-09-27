import java.util.logging.SocketHandler;
import java.io.IOException;
import java.net.Socket;

public class SocketHandler_1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.example.com", 80);
            SocketHandler socketHandler = new SocketHandler(socket, "Logging to Socket");
            socketHandler.push();

            // Use the socketHandler for logging
            //...

            // Close the socketHandler
            socketHandler.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

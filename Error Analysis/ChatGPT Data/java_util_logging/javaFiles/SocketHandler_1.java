import java.util.logging.SocketHandler;
import java.io.IOException;

public class SocketHandler_1 {
    public static void main(String[] args) {
        SocketHandler socketHandler = new SocketHandler();
        
        try {
            // perform some logging operations
            
            // close the SocketHandler
            socketHandler.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

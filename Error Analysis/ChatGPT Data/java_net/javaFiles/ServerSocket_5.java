import java.net.ServerSocket;
import java.io.IOException;

public class ServerSocket_5 {
    public static void main(String[] args) {
        ServerSocket serverSocket = new ServerSocket();
        
        try {
            serverSocket.setReuseAddress(true);
            System.out.println("Reuse address set to true");
        } catch (IOException e) {
            System.out.println("Error setting reuse address: " + e.getMessage());
        }
    }
}

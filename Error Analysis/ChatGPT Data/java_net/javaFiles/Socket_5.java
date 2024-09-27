import java.net.Socket;

public class Socket_5 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.setSoTimeout(5000); // Set the timeout in milliseconds
            System.out.println("Socket timeout set to 5 seconds");
        } catch (Exception e) {
            System.out.println("Error setting socket timeout: " + e.getMessage());
        }
    }
}

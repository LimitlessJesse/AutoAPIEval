import javax.net.ssl.SSLSocket;

public class SSLSocket_3 {
    public static void main(String[] args) {
        SSLSocket socket = null; // Initialize your SSLSocket here
        boolean isSessionCreationEnabled = socket.getEnableSessionCreation();
        System.out.println("Is session creation enabled: " + isSessionCreationEnabled);
    }
}

import javax.net.ssl.SSLSocket;

public class SSLSocket_1 {
    public static void main(String[] args) {
        SSLSocket socket = new SSLSocket() {
            @Override
            public void startHandshake() {
                // Implement your logic for starting SSL handshake
                System.out.println("SSL handshake initiated");
            }
        };

        socket.startHandshake();
    }
}

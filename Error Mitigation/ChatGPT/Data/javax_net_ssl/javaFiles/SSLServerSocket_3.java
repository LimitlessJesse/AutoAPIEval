import javax.net.ssl.SSLServerSocket;

public class SSLServerSocket_3 {
    public static void main(String[] args) {
        SSLServerSocket serverSocket = null; // Initialize your SSLServerSocket object
        
        String[] supportedCipherSuites = serverSocket.getSupportedCipherSuites();
        
        for (String cipherSuite : supportedCipherSuites) {
            System.out.println(cipherSuite);
        }
    }
}

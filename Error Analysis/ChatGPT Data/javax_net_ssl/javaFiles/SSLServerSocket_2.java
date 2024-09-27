import javax.net.ssl.SSLServerSocket;

public class SSLServerSocket_2 {
    public static void main(String[] args) {
        SSLServerSocket sslServerSocket; // Assume sslServerSocket is already initialized
        
        String[] supportedCipherSuites = sslServerSocket.getSupportedCipherSuites();
        
        for (String cipherSuite : supportedCipherSuites) {
            System.out.println(cipherSuite);
        }
    }
}

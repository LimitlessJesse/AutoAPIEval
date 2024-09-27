import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLParameters;

public class SSLServerSocket_1 {
    public static void main(String[] args) {
        SSLServerSocket serverSocket = null; // Initialize your SSLServerSocket
        
        SSLParameters sslParameters = serverSocket.getSSLParameters();
        System.out.println("Ciphersuites: " + sslParameters.getCipherSuites());
        System.out.println("Protocols: " + sslParameters.getProtocols());
    }
}

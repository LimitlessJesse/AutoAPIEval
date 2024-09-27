import javax.net.ssl.SSLServerSocket;

public class SSLServerSocket_2 {
    public static void main(String[] args) {
        SSLServerSocket serverSocket = null; // Initialize your SSLServerSocket object
        
        String[] enabledCipherSuites = serverSocket.getEnabledCipherSuites();
        
        for (String cipherSuite : enabledCipherSuites) {
            System.out.println(cipherSuite);
        }
    }
}

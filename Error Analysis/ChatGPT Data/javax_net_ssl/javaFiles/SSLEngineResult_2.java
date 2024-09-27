import javax.net.ssl.SSLEngineResult;

public class SSLEngineResult_2 {
    public static void main(String[] args) {
        // Assume sslEngineResult is an instance of SSLEngineResult
        SSLEngineResult.HandshakeStatus handshakeStatus = sslEngineResult.getHandshakeStatus();
        System.out.println("Handshake Status: " + handshakeStatus);
    }
}

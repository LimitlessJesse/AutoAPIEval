import javax.net.ssl.SSLEngineResult;

public class SSLEngineResult_3 {
    public static void main(String[] args) {
        SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_WRAP;
        System.out.println("Handshake Status: " + handshakeStatus);
    }
}

import javax.net.ssl.SSLEngineResult;

public class SSLEngineResult_5 {
    public static void main(String[] args) {
        SSLEngineResult result = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.FINISHED, 10, 20);
        int bytesProduced = result.bytesProduced();
        System.out.println("Bytes Produced: " + bytesProduced);
    }
}

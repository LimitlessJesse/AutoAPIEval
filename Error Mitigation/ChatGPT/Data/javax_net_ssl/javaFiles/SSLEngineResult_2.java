import javax.net.ssl.SSLEngineResult;

public class SSLEngineResult_2 {
    public static void main(String[] args) {
        SSLEngineResult result = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, 10, 20);
        int bytesProduced = result.bytesProduced();
        System.out.println("Bytes produced: " + bytesProduced);
    }
}

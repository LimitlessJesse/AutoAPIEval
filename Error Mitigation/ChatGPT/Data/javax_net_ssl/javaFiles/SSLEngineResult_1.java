import javax.net.ssl.SSLEngineResult;

public class SSLEngineResult_1 {
    public static void main(String[] args) {
        SSLEngineResult result = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, 10, 20);
        int consumedBytes = result.bytesConsumed();
        System.out.println("Bytes consumed: " + consumedBytes);
    }
}

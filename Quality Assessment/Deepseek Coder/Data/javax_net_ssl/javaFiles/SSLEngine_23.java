import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLEngine;

public class SSLEngine_23 {
    public static void main(String[] args) {
        SSLEngine engine = SSLContext.getDefault().createSSLEngine();
        SSLParameters parameters = engine.getSSLParameters();
        System.out.println(parameters);
    }
}

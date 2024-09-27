import javax.net.ssl.SSLEngine;

public class SSLEngine_4 {
    public static void main(String[] args) {
        SSLEngine engine = SSLEngine.getDefault();
        String[] enabledProtocols = engine.getEnabledProtocols();
        for (String protocol : enabledProtocols) {
            System.out.println(protocol);
        }
    }
}

import javax.net.ssl.ExtendedSSLSession;

public class ExtendedSSLSession_5 {
    public static void main(String[] args) {
        ExtendedSSLSession session = new ExtendedSSLSession() {
            @Override
            public String[] getPeerSupportedSignatureAlgorithms() {
                // Add implementation here
                return new String[0];
            }
        };

        String[] supportedAlgorithms = session.getPeerSupportedSignatureAlgorithms();
        for (String algorithm : supportedAlgorithms) {
            System.out.println(algorithm);
        }
    }
}

import java.net.SecureCacheResponse;

public class SecureCacheResponse_4 {
    public static void main(String[] args) {
        SecureCacheResponse response = new SecureCacheResponse() {
            @Override
            public String getCipherSuite() {
                return "TLS_RSA_WITH_AES_128_CBC_SHA";
            }
        };
        
        String cipherSuite = response.getCipherSuite();
        System.out.println("Cipher Suite: " + cipherSuite);
    }
}

import java.net.SecureCacheResponse;

public class SecureCacheResponse_3 {
    public static void main(String[] args) {
        SecureCacheResponse response = new SecureCacheResponse() {
            @Override
            public String getCipherSuite() {
                return "TLS_RSA_WITH_AES_128_CBC_SHA";
            }
        };
        
        System.out.println("Cipher Suite: " + response.getCipherSuite());
    }
}

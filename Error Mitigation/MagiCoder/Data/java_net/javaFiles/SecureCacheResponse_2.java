import java.net.URL;
import java.net.URLConnection;
import java.net.SecureCacheResponse;
import java.io.IOException;

public class SecureCacheResponse_2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.example.com");
        URLConnection urlConnection = url.openConnection();
        SecureCacheResponse secureCacheResponse = (SecureCacheResponse) urlConnection.getCacheResponse();
        String cipherSuite = secureCacheResponse.getCipherSuite();
        System.out.println("Cipher Suite: " + cipherSuite);
    }
}

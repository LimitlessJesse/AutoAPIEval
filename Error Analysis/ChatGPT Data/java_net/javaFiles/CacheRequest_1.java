import java.net.CacheRequest;

public class CacheRequest_1 {
    public static void main(String[] args) {
        // Using the void abort() method from java.net.CacheRequest
        CacheRequest cacheRequest = new CacheRequest() {
            @Override
            public void abort() {
                // Implementation of abort method
                System.out.println("Request aborted");
            }

            @Override
            public OutputStream getBody() {
                return null;
            }
        };

        // Calling the abort method
        cacheRequest.abort();
    }
}

import java.net.ResponseCache;

public class ResponseCache_2 {
    public static void main(String[] args) {
        // Set the system-wide cache
        ResponseCache responseCache = new MyResponseCache(); // Assuming MyResponseCache is a custom implementation of ResponseCache
        ResponseCache.setDefault(responseCache);
    }
}

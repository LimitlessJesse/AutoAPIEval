import java.net.ResponseCache;

public class ResponseCache_1 {
    public static void main(String[] args) {
        ResponseCache responseCache = ResponseCache.getDefault();
        System.out.println("System-wide ResponseCache: " + responseCache);
    }
}

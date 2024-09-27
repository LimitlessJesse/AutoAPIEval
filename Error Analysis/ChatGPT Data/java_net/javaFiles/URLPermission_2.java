import java.net.URLPermission;

public class URLPermission_2 {
    public static void main(String[] args) {
        URLPermission permission = new URLPermission("http://example.com/*", "read");
        int hashCode = permission.hashCode();
        System.out.println("Hash code for URL permission: " + hashCode);
    }
}

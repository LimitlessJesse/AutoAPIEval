import java.net.URLPermission;

public class URLPermission_3 {
    public static void main(String[] args) {
        URLPermission permission1 = new URLPermission("http://www.example.com/*", "read");
        URLPermission permission2 = new URLPermission("http://www.example.com/*", "write");
        
        boolean implies = permission1.implies(permission2);
        System.out.println("Permission1 implies Permission2: " + implies);
    }
}

import java.net.URLPermission;

public class URLPermission_4 {
    public static void main(String[] args) {
        URLPermission permission1 = new URLPermission("http://www.example.com");
        URLPermission permission2 = new URLPermission("http://www.example.com");

        boolean isEqual = permission1.equals(permission2);

        System.out.println("Are the two permissions equal? " + isEqual);
    }
}

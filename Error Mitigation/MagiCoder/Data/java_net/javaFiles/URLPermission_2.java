import java.net.URLPermission;

public class URLPermission_2 {
    public static void main(String[] args) {
        URLPermission permission = new URLPermission("http://www.example.com", "get,head");
        System.out.println(permission.getActions());
    }
}

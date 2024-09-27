import java.security.Security;

public class Security_4 {
    public static void main(String[] args) {
        String property = Security.getProperty("security.provider");
        System.out.println("Security property value: " + property);
    }
}

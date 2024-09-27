import java.security.Security;

public class Security_2 {
    public static void main(String[] args) {
        String key = "key";
        try {
            String value = Security.getProperty(key);
            System.out.println("Value of property " + key + " is: " + value);
        } catch (SecurityException e) {
            System.out.println("SecurityException: " + e.getMessage());
        }
    }
}

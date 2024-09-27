import java.security.Security;

public class Security_2 {
    public static void main(String[] args) {
        // Set a system property
        Security.setProperty("propertyKey", "propertyValue");
        
        // Get the system property
        String propertyValue = System.getProperty("propertyKey");
        System.out.println(propertyValue);  // Output: propertyValue
    }
}

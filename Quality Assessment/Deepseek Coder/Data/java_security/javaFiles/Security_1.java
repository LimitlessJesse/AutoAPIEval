import java.security.Security;

public class Security_1 {
    public static void main(String[] args) {
        String key = "file.separator";
        String property = Security.getProperty(key);
        System.out.println("The property for key \"" + key + "\" is \"" + property + "\"");
    }
}

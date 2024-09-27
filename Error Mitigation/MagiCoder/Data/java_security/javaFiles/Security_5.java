import java.security.Provider;
import java.security.Security;

public class Security_5 {
    public static void main(String[] args) {
        Provider provider = Security.getProvider("SUN");
        if (provider!= null) {
            System.out.println("Provider found: " + provider.getName());
        } else {
            System.out.println("Provider not found");
        }
    }
}

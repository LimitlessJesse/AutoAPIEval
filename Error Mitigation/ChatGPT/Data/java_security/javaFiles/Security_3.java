import java.security.Provider;
import java.security.Security;

public class Security_3 {
    public static void main(String[] args) {
        Provider provider = Security.getProvider("SUN");
        System.out.println("Provider: " + provider);
    }
}

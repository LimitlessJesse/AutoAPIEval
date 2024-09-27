import java.security.Provider;
import java.security.Security;

public class Provider_3 {
    public static void main(String[] args) {
        Provider provider = Security.getProvider("SUN");
        if (provider!= null) {
            String providerName = provider.getName();
            System.out.println("Provider Name: " + providerName);
        } else {
            System.out.println("Provider not found");
        }
    }
}

import java.security.Provider;
import java.security.Security;

public class Provider_4 {
    public static void main(String[] args) {
        Provider provider = Security.getProvider("SUN");
        if (provider!= null) {
            System.out.println(provider.getInfo());
        } else {
            System.out.println("Provider not found");
        }
    }
}

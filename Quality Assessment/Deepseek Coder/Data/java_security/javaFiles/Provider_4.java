import java.security.Provider;
import java.security.Security;

public class Provider_4 {
    public static void main(String[] args) {
        for (Provider provider : Security.getProviders()) {
            System.out.println(provider.getName() + ": " + provider.getInfo());
        }
    }
}

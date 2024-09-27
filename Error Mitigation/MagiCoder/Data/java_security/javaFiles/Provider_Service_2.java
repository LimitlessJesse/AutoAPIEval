import java.security.Provider;
import java.security.Security;

public class Provider_Service_2 {
    public static void main(String[] args) {
        Provider[] providers = Security.getProviders();
        for (Provider provider : providers) {
            for (Provider.Service service : provider.getServices()) {
                System.out.println("Algorithm: " + service.getAlgorithm());
            }
        }
    }
}

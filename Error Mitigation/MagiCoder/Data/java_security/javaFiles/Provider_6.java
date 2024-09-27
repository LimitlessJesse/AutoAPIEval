import java.security.Provider;
import java.util.Set;

public class Provider_6 {
    public static void main(String[] args) {
        Provider provider = Provider.getDefault();
        Set<Provider.Service> services = provider.getServices();
        for (Provider.Service service : services) {
            System.out.println(service.getType() + ": " + service.getAlgorithm());
        }
    }
}

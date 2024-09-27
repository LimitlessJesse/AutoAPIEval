import java.security.Provider;
import java.security.Security;

public class Provider_Service_1 {
    public static void main(String[] args) {
        Provider provider = Security.getProvider("YourProviderName");
        for (Provider.Service service : provider.getServices()) {
            System.out.println(service.getType());
        }
    }
}

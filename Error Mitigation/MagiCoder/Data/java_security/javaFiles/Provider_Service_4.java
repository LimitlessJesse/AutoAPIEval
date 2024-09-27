import java.security.Provider;
import java.security.Provider.Service;

public class Provider_Service_4 {
    public static void main(String[] args) {
        Provider provider = new Provider("MyProvider", 1.0, "My Provider");
        Service service = new Service("MyService", "MyService", "MyService", true, null, null, null);
        service.setProvider(provider);
        Provider providerFromService = service.getProvider();
        System.out.println(providerFromService.getName());
    }
}

import java.security.Provider;
import java.security.Provider.Service;

public class Provider_Service_4 {
    public static void main(String[] args) {
        Provider provider = new Provider("TestProvider", 1.0, "Test Provider");
        Service service = new Service("TestService", "TestService", "Test Service");
        provider.putService(service);

        Service foundService = provider.getService("TestService");
        Provider foundProvider = foundService.getProvider();

        System.out.println("Provider Name: " + foundProvider.getName());
        System.out.println("Provider Version: " + foundProvider.getVersion());
    }
}

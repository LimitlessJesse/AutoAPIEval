import java.security.Provider;
import java.security.Provider.Service;

public class Provider_Service_1 {
    public static void main(String[] args) {
        Provider provider = new Provider("MyProvider", 1.0, "My security provider") {};
        Service service = new Service(provider, "MyService", "My security service", "MyServiceType", null, null);
        
        String type = service.getType();
        System.out.println("Service type: " + type);
    }
}

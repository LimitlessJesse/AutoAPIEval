import java.security.Provider;
import java.security.Provider.Service;

public class Provider_Service_2 {
    public static void main(String[] args) {
        Provider provider = new Provider("MyProvider", 1.0, "My security provider") {};
        Service service = new Service(provider, "MyService", "My security service", "MyClass", null, null);
        
        String algorithm = service.getAlgorithm();
        System.out.println("Algorithm: " + algorithm);
    }
}

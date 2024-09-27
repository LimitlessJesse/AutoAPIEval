import java.security.Provider;
import java.security.Provider.Service;

public class Provider_Service_3 {
    public static void main(String[] args) {
        Provider provider = new Provider("MyProvider", 1.0, "My security provider") {};
        Service service = provider.getService("MyService", "MyAlgorithm");
        String className = service.getClassName();
        System.out.println("Class implementing this service: " + className);
    }
}

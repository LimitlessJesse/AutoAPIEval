import java.security.Provider;
import java.security.Provider.Service;

public class Provider_Service_1 {
    public static void main(String[] args) {
        Provider provider = new Provider("MyProvider", 1.0, "My custom provider") {};
        Service service = provider.getService("AlgorithmName", "Type");

        if (service != null) {
            System.out.println("Service type: " + service.getType());
        } else {
            System.out.println("Service not found");
        }
    }
}

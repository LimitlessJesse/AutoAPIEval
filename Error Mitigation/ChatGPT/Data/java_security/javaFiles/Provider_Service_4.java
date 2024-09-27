import java.security.Provider;
import java.security.Provider.Service;

public class Provider_Service_4 {
    public static void main(String[] args) {
        Provider provider = new Provider("TestProvider", 1.0, "Test security provider") {};
        Service service = new Service(provider, "TestService", "Test security service", "TestService", null, null);
        
        String attributeValue = service.getAttribute("TestAttribute");
        System.out.println("Attribute value: " + attributeValue);
    }
}

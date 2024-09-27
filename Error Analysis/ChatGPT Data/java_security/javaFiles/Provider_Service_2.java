import java.security.Provider;
import java.security.Provider.Service;

public class Provider_Service_2 {
    public static void main(String[] args) {
        Provider provider = new Provider("MyProvider", 1.0, "My custom provider") {};
        Service service = provider.getService("MessageDigest", "SHA-256");
        String algorithm = service.getAlgorithm();
        System.out.println(algorithm);
    }
}

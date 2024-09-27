import java.security.Provider;
import java.security.Security;

public class Security_2 {
    public static void main(String[] args) {
        Provider provider = new Provider("MyProvider", 1.0, "Description") {};
        int position = 1;
        Security.insertProviderAt(provider, position);
    }
}

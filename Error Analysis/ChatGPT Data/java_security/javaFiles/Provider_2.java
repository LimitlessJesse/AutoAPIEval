import java.security.Provider;

public class Provider_2 {
    public static void main(String[] args) {
        Provider provider = new Provider("testProvider", 1.0, "Test Provider") {};

        double version = provider.getVersion();
        System.out.println("Provider Version: " + version);
    }
}

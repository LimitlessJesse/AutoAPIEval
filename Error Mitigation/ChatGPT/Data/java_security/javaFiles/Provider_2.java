import java.security.Provider;

public class Provider_2 {
    public static void main(String[] args) {
        Provider provider = new Provider("MyProvider", 1.0, "My custom security provider") {
            @Override
            public double getVersion() {
                return 1.0;
            }
        };
        
        System.out.println("Provider version: " + provider.getVersion());
    }
}

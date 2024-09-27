import java.security.Provider;

public class Provider_1 {
    public static void main(String[] args) {
        Provider provider = new Provider("MyProvider", 1.0, "My custom provider") {
            @Override
            public String getName() {
                return super.getName();
            }
        };
        
        System.out.println("Provider name: " + provider.getName());
    }
}

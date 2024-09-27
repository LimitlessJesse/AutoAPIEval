import java.security.Provider;

public class Provider_5 {
    public static void main(String[] args) {
        Provider provider = new Provider("TestProvider", 1.0, "Test Provider") {
            // Implementing the get method
            public Object get(Object key) {
                // Custom implementation here
                return null;
            }
        };
        
        // Using the get method
        Object value = provider.get("key");
        System.out.println("Value: " + value);
    }
}

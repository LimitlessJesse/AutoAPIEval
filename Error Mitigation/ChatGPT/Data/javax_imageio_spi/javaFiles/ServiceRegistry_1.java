import javax.imageio.spi.ServiceRegistry;

public class ServiceRegistry_1 {
    public static void main(String[] args) {
        ServiceRegistry registry = new ServiceRegistry();
        Object provider = new Object(); // Create a service provider object
        registry.registerServiceProvider(provider);
    }
}

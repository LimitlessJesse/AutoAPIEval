import javax.imageio.spi.ServiceRegistry;

public class ServiceRegistry_4 {
    public static void main(String[] args) {
        ServiceRegistry registry = new ServiceRegistry();
        Object provider = new Object();
        registry.add(provider);
        boolean contains = registry.contains(provider);
        System.out.println(contains);
    }
}

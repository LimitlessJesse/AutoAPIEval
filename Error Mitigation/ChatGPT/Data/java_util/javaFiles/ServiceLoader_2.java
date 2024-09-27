import java.util.ServiceLoader;

public class ServiceLoader_2 {
    public static void main(String[] args) {
        ServiceLoader<?> loader = ServiceLoader.load(Service.class);
        loader.reload();
    }
}

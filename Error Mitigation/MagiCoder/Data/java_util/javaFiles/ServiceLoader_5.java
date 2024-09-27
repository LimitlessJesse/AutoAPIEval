import java.util.ServiceLoader;

public class ServiceLoader_5 {
    public static void main(String[] args) {
        ServiceLoader<Object> loader = ServiceLoader.load(Object.class);
        loader.reload();
    }
}

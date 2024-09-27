import java.util.ServiceLoader;

public class ServiceLoader_4 {
    public static void main(String[] args) {
        ServiceLoader<Runnable> loader = ServiceLoader.load(Runnable.class);
        for (Runnable runnable : loader) {
            runnable.run();
        }

        // Reload the service provider configuration
        loader.reload();

        for (Runnable runnable : loader) {
            runnable.run();
        }
    }
}

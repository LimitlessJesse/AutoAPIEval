import javax.xml.ws.Endpoint;
import java.util.concurrent.Executor;

public class Endpoint_3 {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(null);
        Executor executor = Runnable::run; // Example executor, you can use your own implementation
        endpoint.setExecutor(executor);
    }
}

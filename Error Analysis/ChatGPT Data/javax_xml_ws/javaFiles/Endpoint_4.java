import javax.xml.ws.Endpoint;
import java.util.concurrent.Executor;

public class Endpoint_4 {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new MyService());
        Executor executor = Executors.newFixedThreadPool(10);
        endpoint.setExecutor(executor);
        endpoint.publish("http://localhost:8080/myService");
    }

    static class MyService {
        public String sayHello() {
            return "Hello, World!";
        }
    }
}

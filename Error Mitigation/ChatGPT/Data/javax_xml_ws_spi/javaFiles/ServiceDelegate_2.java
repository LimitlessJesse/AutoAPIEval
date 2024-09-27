import javax.xml.ws.spi.ServiceDelegate;
import java.util.concurrent.Executor;

public class ServiceDelegate_2 {
    public static void main(String[] args) {
        ServiceDelegate serviceDelegate = new ServiceDelegate(); // Instantiate ServiceDelegate
        Executor executor = serviceDelegate.getExecutor(); // Get the executor
        System.out.println("Executor: " + executor);
    }
}

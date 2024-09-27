import javax.xml.ws.Service;
import java.util.concurrent.Executor;

public class Service_4 {
    public static void main(String[] args) {
        Service service = new Service();
        Executor executor = service.getExecutor();
        System.out.println("Executor: " + executor);
    }
}

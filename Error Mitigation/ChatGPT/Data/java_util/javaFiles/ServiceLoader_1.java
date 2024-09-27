import java.util.ServiceLoader;
import java.util.Iterator;

public class ServiceLoader_1 {
    public static void main(String[] args) {
        ServiceLoader<MyService> loader = ServiceLoader.load(MyService.class);
        Iterator<MyService> iterator = loader.iterator();
        
        while (iterator.hasNext()) {
            MyService service = iterator.next();
            // Do something with the service
        }
    }
}

interface MyService {
    // Define methods for the service
}

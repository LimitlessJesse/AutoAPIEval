import javax.xml.ws.Service;
import javax.xml.ws.handler.HandlerResolver;

public class Service_3 {
    public static void main(String[] args) {
        Service service = new Service();
        HandlerResolver handlerResolver = service.getHandlerResolver();
        System.out.println(handlerResolver);
    }
}

import javax.xml.ws.Service;

public class Service_5 {
    public static void main(String[] args) {
        Service service = new Service();
        HandlerResolver handlerResolver = service.getHandlerResolver();
        System.out.println("HandlerResolver: " + handlerResolver);
    }
}

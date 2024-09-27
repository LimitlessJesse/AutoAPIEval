import javax.xml.ws.spi.ServiceDelegate;

public class ServiceDelegate_4 {
    public static void main(String[] args) {
        ServiceDelegate delegate = new ServiceDelegate();
        QName serviceName = delegate.getServiceName();
        System.out.println("Service Name: " + serviceName);
    }
}

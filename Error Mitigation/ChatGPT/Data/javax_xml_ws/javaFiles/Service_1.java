import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Service_1 {
    public static void main(String[] args) {
        Service service = new Service();
        QName serviceName = service.getServiceName();
        System.out.println("Service Name: " + serviceName);
    }
}

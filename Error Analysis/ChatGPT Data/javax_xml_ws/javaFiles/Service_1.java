import javax.xml.ws.Service;
import javax.xml.namespace.QName;

public class Service_1 {
    public static void main(String[] args) {
        QName serviceName = Service.getServiceName();
        System.out.println("Service Name: " + serviceName);
    }
}

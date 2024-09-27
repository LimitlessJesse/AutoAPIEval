import javax.xml.namespace.QName;
import javax.xml.ws.spi.ServiceDelegate;
import javax.xml.ws.Service;

public class ServiceDelegate_3 {
    public static void main(String[] args) {
        Service service = Service.create(new QName("namespaceURI", "localPart"));
        ServiceDelegate serviceDelegate = (ServiceDelegate) service;
        
        Iterator<QName> ports = serviceDelegate.getPorts();
        while(ports.hasNext()) {
            QName port = ports.next();
            System.out.println(port);
        }
    }
}

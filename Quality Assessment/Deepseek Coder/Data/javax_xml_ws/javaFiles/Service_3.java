import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;

public class Service_3 {
    @WebServiceRef(wsdlLocation = "http://example.com/service?wsdl")
    static Service service;

    public static void main(String[] args) {
        QName serviceName = service.getServiceName();
        System.out.println("Service Name: " + serviceName.getLocalPart());
    }
}

import javax.xml.ws.Service;
import java.net.URL;

public class Service_2 {
    public static void main(String[] args) {
        Service service = new Service();
        URL wsdlLocation = service.getWSDLDocumentLocation();
        System.out.println("WSDL Document Location: " + wsdlLocation);
    }
}

import javax.xml.ws.Endpoint;
import javax.xml.ws.EndpointReference;
import org.w3c.dom.Element;

public class Endpoint_5 {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new Object());
        Element element = null; // Initialize with actual Element object
        EndpointReference endpointReference = endpoint.getEndpointReference(element);
        System.out.println(endpointReference);
    }
}

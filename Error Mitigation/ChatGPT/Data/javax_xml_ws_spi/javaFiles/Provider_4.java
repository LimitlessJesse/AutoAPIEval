import javax.xml.ws.Endpoint;
import javax.xml.ws.spi.Provider;
import javax.xml.ws.WebServiceFeature;

public class Provider_4 {
    public static void main(String[] args) {
        Provider provider = Provider.provider();
        Endpoint endpoint = provider.createEndpoint("http://schemas.xmlsoap.org/wsdl/soap/http", new MyService(), new WebServiceFeature());
        System.out.println("Endpoint created: " + endpoint);
    }
}

class MyService {
    // Service implementation code here
}

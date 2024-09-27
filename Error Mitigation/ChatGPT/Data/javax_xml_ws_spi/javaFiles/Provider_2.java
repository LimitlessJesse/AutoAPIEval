import javax.xml.ws.Endpoint;
import javax.xml.ws.spi.Provider;

public class Provider_2 {
    public static void main(String[] args) {
        Provider provider = Provider.provider();
        Endpoint endpoint = provider.createEndpoint("http://schemas.xmlsoap.org/wsdl/soap/http", new MyService());
        System.out.println("Endpoint created: " + endpoint);
    }

    static class MyService {
        // Service implementation
    }
}

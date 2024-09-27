import javax.xml.ws.Endpoint;

public class Endpoint_5 {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new MyService());
        System.out.println(endpoint.getBinding());
    }
}

class MyService {
    // Service implementation
}

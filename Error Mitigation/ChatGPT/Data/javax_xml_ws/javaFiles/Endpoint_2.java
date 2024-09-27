import javax.xml.ws.Endpoint;

public class Endpoint_2 {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new MyWebService());
        endpoint.publish("http://localhost:8080/myWebService");
        
        // Stop publishing the endpoint
        endpoint.stop();
    }
}

class MyWebService {
    // Web service implementation
}

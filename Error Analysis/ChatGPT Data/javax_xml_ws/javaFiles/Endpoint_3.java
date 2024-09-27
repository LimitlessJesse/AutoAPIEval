import javax.xml.ws.Endpoint;

public class Endpoint_3 {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new MyService());
        
        // Start the endpoint
        endpoint.publish("http://localhost:8080/myService");
        
        // Some operations
        
        // Stop the endpoint
        endpoint.stop();
        
        System.out.println("Endpoint stopped");
    }
}

class MyService {
    // Implementation of the service
}

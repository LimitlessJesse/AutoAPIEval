import javax.xml.ws.Endpoint;

public class Endpoint_1 {
    public static void main(String[] args) {
        MyImplementor implementor = new MyImplementor();
        Endpoint.publish("http://localhost:8080/HelloWorld", implementor);
    }
}

class MyImplementor {
    // your implementation code here
}

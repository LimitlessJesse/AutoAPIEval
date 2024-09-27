import org.omg.CORBA.Request;

public class Request_5 {
    public static void main(String[] args) {
        Request request = new Request();
        request.send_oneway();
    }
}

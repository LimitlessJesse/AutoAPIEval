import org.omg.CORBA.Request;

public class Request_4 {
    public static void main(String[] args) {
        Request request = new Request();
        request.send_deferred();
    }
}

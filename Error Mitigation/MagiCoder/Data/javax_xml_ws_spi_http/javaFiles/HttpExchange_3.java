import javax.xml.ws.spi.http.HttpExchange;
import java.util.List;

public class HttpExchange_3 {
    public static void main(String[] args) {
        // Assume we have an HttpExchange object named exchange
        HttpExchange exchange =...;

        // Get the value of a specific request header
        String headerValue = exchange.getRequestHeader("Content-Type");
        System.out.println("Content-Type: " + headerValue);

        // Get all request headers
        List<String> headerNames = exchange.getRequestHeaderNames();
        for (String headerName : headerNames) {
            System.out.println(headerName + ": " + exchange.getRequestHeader(headerName));
        }
    }
}

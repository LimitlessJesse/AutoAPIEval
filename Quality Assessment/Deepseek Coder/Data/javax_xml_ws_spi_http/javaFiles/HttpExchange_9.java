import javax.xml.ws.spi.http.HttpExchange;
import java.io.InputStream;
import java.io.IOException;

public class HttpExchange_9 {
    public static void main(String[] args) {
        // Assume we have an HttpExchange object
        HttpExchange exchange = null;

        // Get the request body as an InputStream
        InputStream requestBody = exchange.getRequestBody();

        // Read the content of the request body
        try {
            int content;
            while ((content = requestBody.read())!= -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import javax.xml.ws.spi.http.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;

public class HttpExchange_10 {
    public static void main(String[] args) {
        HttpExchange exchange = /* get HttpExchange instance somehow */;
        try {
            OutputStream outputStream = exchange.getResponseBody();
            String response = "Hello, World!";
            outputStream.write(response.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

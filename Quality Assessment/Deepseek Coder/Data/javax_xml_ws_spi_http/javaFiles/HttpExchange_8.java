import javax.xml.ws.spi.http.HttpExchange;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpExchange_8 {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
               .uri(URI.create("http://example.com"))
               .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        HttpExchange exchange = new HttpExchange() {
            @Override
            public String getRequestURI() {
                return request.uri().toString();
            }
        };
        System.out.println("Request URI: " + exchange.getRequestURI());
    }
}

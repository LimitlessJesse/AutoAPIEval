import javax.xml.ws.spi.http.HttpExchange;

public class HttpExchange_4 {
    public static void main(String[] args) {
        HttpExchange exchange = new HttpExchange() {
            @Override
            public String getRequestMethod() {
                return "GET";
            }
        };

        System.out.println("Request Method: " + exchange.getRequestMethod());
    }
}

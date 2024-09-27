import javax.xml.ws.spi.http.HttpExchange;

public class HttpExchange_3 {
    public static void main(String[] args) {
        HttpExchange exchange = new HttpExchange() {
            @Override
            public String getRequestURI() {
                return "/example/path?param=value";
            }
        };

        System.out.println("Request URI: " + exchange.getRequestURI());
    }
}

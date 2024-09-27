import javax.xml.ws.spi.http.HttpExchange;

public class HttpExchange_5 {
    public static void main(String[] args) {
        HttpExchange exchange = new HttpExchange() {
            @Override
            public void setStatus(int status) {
                System.out.println("Setting status code to: " + status);
            }
        };

        exchange.setStatus(200);
    }
}

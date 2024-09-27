import javax.xml.ws.spi.http.HttpExchange;

public class HttpExchange_5 {
    public static void main(String[] args) {
        HttpExchange exchange = new HttpExchange() {
            @Override
            public void setStatus(int status) {
                System.out.println("Setting status to: " + status);
            }

            // Other abstract methods can be implemented here if needed
        };

        exchange.setStatus(200); // Test setting status
    }
}

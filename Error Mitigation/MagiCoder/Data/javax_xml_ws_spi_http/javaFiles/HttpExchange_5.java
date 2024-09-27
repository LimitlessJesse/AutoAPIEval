import javax.xml.ws.spi.http.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;

public class HttpExchange_5 {
    public static void main(String[] args) {
        HttpExchange httpExchange = new HttpExchange() {
            @Override
            public void close() throws IOException {

            }

            @Override
            public OutputStream getResponseBody() throws IOException {
                return null;
            }

            @Override
            public void setStatus(int i) {

            }
        };

        try {
            OutputStream outputStream = httpExchange.getResponseBody();
            outputStream.write("Hello, World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

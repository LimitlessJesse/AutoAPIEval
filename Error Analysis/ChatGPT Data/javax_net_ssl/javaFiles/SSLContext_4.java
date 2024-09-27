import javax.net.ssl.SSLContext;

public class SSLContext_4 {
    public static void main(String[] args) {
        SSLContext sslContext = SSLContext.getDefault();
        System.out.println("Client Session Context: " + sslContext.getClientSessionContext());
    }
}

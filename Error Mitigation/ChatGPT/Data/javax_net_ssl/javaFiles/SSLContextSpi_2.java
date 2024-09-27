import javax.net.ssl.SSLSocketFactory;

public class SSLContextSpi_2 {
    public static void main(String[] args) {
        // Assume sslContextSpi is an instance of a class that extends SSLContextSpi
        SSLSocketFactory socketFactory = sslContextSpi.engineGetSocketFactory();
        System.out.println(socketFactory);
    }
}

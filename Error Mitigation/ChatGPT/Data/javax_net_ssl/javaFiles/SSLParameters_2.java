import javax.net.ssl.SSLParameters;

public class SSLParameters_2 {
    public static void main(String[] args) {
        SSLParameters sslParams = new SSLParameters();
        String[] protocols = sslParams.getProtocols();
        if (protocols != null) {
            for (String protocol : protocols) {
                System.out.println(protocol);
            }
        } else {
            System.out.println("No protocols have been set.");
        }
    }
}

import javax.net.ssl.SSLParameters;

public class SSLParameters_4 {
    public static void main(String[] args) {
        SSLParameters sslParameters = new SSLParameters();
        String[] protocols = sslParameters.getProtocols();
        
        for (String protocol : protocols) {
            System.out.println(protocol);
        }
    }
}

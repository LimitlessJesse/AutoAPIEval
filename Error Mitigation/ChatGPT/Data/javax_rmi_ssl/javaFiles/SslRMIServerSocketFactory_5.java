import javax.rmi.ssl.SslRMIServerSocketFactory;

public class SslRMIServerSocketFactory_5 {
    public static void main(String[] args) {
        SslRMIServerSocketFactory factory = new SslRMIServerSocketFactory();
        String[] cipherSuites = factory.getEnabledCipherSuites();
        if (cipherSuites != null) {
            for (String cipherSuite : cipherSuites) {
                System.out.println(cipherSuite);
            }
        } else {
            System.out.println("No cipher suites enabled");
        }
    }
}

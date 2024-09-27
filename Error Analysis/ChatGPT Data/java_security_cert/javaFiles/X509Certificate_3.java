import java.security.cert.X509Certificate;

public class X509Certificate_3 {
    public static void main(String[] args) {
        X509Certificate cert = // initialize X509Certificate object

        System.out.println("Certificate not before date: " + cert.getNotBefore());
    }
}

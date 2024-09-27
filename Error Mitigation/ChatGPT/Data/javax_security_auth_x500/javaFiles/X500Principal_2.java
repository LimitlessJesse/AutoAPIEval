import javax.security.auth.x500.X500Principal;

public class X500Principal_2 {
    public static void main(String[] args) {
        X500Principal x500Principal = new X500Principal("CN=John Doe, O=Acme, C=US");
        byte[] encoded = x500Principal.getEncoded();
        
        System.out.println("Encoded X.500 Principal: " + encoded);
    }
}

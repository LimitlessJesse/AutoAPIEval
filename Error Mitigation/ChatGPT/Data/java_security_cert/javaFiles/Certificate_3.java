import java.security.cert.Certificate;

public class Certificate_3 {
    public static void main(String[] args) {
        Certificate cert = new Certificate() {
            @Override
            public String toString() {
                return "Certificate toString method implementation";
            }
        };
        
        System.out.println(cert.toString());
    }
}

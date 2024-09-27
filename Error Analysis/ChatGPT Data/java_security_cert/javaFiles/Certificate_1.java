import java.security.cert.Certificate;
import java.security.interfaces.RSAPublicKey;
import java.security.PublicKey;

public class Certificate_1 {
    public static void main(String[] args) {
        Certificate certificate = // get the certificate from somewhere
        PublicKey publicKey = certificate.getPublicKey();
        
        if (publicKey instanceof RSAPublicKey) {
            RSAPublicKey rsaPublicKey = (RSAPublicKey) publicKey;
            System.out.println("RSA Public Key Modulus: " + rsaPublicKey.getModulus());
            System.out.println("RSA Public Key Exponent: " + rsaPublicKey.getPublicExponent());
        } else {
            System.out.println("Public Key is not RSA type");
        }
    }
}

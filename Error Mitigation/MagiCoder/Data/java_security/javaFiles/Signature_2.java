import java.security.Signature;
import java.security.PrivateKey;
import java.security.InvalidKeyException;

public class Signature_2 {
    public static void main(String[] args) {
        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            PrivateKey privateKey =...; // provide your private key here
            signature.initSign(privateKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

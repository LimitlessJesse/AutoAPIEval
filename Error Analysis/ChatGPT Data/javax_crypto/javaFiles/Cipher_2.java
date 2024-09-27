import javax.crypto.Cipher;
import javax.crypto.Key;
import java.security.spec.AlgorithmParameterSpec;

public class Cipher_2 {
    public static void main(String[] args) {
        int opmode = Cipher.ENCRYPT_MODE;
        Key key = ...; // Initialize your key
        AlgorithmParameterSpec params = ...; // Initialize your AlgorithmParameterSpec
        
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(opmode, key, params);
    }
}

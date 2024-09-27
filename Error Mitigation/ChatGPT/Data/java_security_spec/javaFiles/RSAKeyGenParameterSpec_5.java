import java.security.spec.RSAKeyGenParameterSpec;

public class RSAKeyGenParameterSpec_5 {
    public static void main(String[] args) {
        RSAKeyGenParameterSpec spec = new RSAKeyGenParameterSpec(1024, RSAKeyGenParameterSpec.F4);
        int keySize = spec.getKeysize();
        System.out.println("RSA key size: " + keySize);
    }
}

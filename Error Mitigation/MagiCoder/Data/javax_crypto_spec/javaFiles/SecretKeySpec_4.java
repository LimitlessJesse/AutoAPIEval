import javax.crypto.spec.SecretKeySpec;

public class SecretKeySpec_4 {
    public static void main(String[] args) {
        SecretKeySpec secretKeySpec = new SecretKeySpec("myKey".getBytes(), "AES");
        String format = secretKeySpec.getFormat();
        System.out.println(format);
    }
}

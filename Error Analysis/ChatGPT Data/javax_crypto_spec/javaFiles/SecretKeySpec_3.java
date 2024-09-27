import javax.crypto.spec.SecretKeySpec;

public class SecretKeySpec_3 {
    public static void main(String[] args) {
        SecretKeySpec key = new SecretKeySpec("key".getBytes(), "AES");
        int hashCode = key.hashCode();
        System.out.println("Hash Code: " + hashCode);
    }
}

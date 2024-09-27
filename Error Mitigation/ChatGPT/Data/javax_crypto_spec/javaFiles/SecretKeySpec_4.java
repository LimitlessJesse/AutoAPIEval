import javax.crypto.spec.SecretKeySpec;

public class SecretKeySpec_4 {
    public static void main(String[] args) {
        SecretKeySpec key = new SecretKeySpec(new byte[]{1, 2, 3}, "AES");
        int hashCode = key.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}

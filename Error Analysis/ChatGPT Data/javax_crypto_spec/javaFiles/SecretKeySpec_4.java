import javax.crypto.spec.SecretKeySpec;

public class SecretKeySpec_4 {
    public static void main(String[] args) {
        SecretKeySpec key1 = new SecretKeySpec(new byte[]{1, 2, 3}, "AES");
        SecretKeySpec key2 = new SecretKeySpec(new byte[]{4, 5, 6}, "AES");

        boolean isEqual = key1.equals(key2);
        System.out.println("Keys are equal: " + isEqual);
    }
}

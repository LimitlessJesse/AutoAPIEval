import javax.crypto.spec.SecretKeySpec;

public class SecretKeySpec_5 {
    public static void main(String[] args) {
        SecretKeySpec key1 = new SecretKeySpec(new byte[]{1, 2, 3}, "AES");
        SecretKeySpec key2 = new SecretKeySpec(new byte[]{1, 2, 3}, "AES");

        boolean result = key1.equals(key2);
        System.out.println("Are key1 and key2 equal? " + result);
    }
}

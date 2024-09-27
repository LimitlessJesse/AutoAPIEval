import javax.crypto.spec.DESKeySpec;

public class DESKeySpec_1 {
    public static void main(String[] args) {
        byte[] keyData = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        try {
            DESKeySpec desKeySpec = new DESKeySpec(keyData);
            byte[] key = desKeySpec.getKey();
            System.out.println("Key: " + key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

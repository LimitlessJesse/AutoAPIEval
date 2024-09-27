import javax.crypto.spec.DESKeySpec;

public class DESKeySpec_2 {
    public static void main(String[] args) {
        try {
            byte[] keyMaterial = new byte[]{0x01, 0x23, 0x45, 0x67, (byte)0x89, (byte)0xab, (byte)0xcd, (byte)0xef};
            DESKeySpec desKey = new DESKeySpec(keyMaterial);
            byte[] key = desKey.getKey();
            System.out.println("DES Key Material: " + new String(key));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

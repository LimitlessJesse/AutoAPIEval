import javax.crypto.Cipher;

public class Cipher_3 {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            byte[] input = "Hello World".getBytes();
            byte[] key = "1234567890123456".getBytes();
            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"));
            byte[] encryptedData = cipher.doFinal(input);

            byte[] updatedData = cipher.update(encryptedData, 0, encryptedData.length);

            for (byte b : updatedData) {
                System.out.print((char) b);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

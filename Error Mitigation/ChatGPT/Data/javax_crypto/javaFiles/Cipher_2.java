import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;

public class Cipher_2 {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            // Initialize cipher

            byte[] result = cipher.doFinal();
            // Process the input data and store the result in a new buffer

            // Use the result as needed
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

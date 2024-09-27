import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public class Cipher_3 {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] input = "Hello World".getBytes();
            byte[] output = new byte[cipher.getOutputSize(input.length)];
            int bytesProcessed = cipher.update(input, 0, input.length, output, 0);
            System.out.println("Number of bytes stored in output: " + bytesProcessed);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

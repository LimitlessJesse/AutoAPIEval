import javax.crypto.Cipher;

public class Cipher_5 {
    public static void main(String[] args) {
        int inputLen = 16;
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        int outputSize = cipher.getOutputSize(inputLen);
        System.out.println("Output size for input length " + inputLen + ": " + outputSize);
    }
}

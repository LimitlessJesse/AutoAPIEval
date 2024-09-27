import javax.crypto.Cipher;

public class Cipher_2 {
    public static void main(String[] args) {
        int len = 1024;
        int outputSize = Cipher.getOutputSize(len);
        System.out.println("The output size is: " + outputSize);
    }
}

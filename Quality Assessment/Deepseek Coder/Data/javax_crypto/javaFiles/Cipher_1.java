import javax.crypto.Cipher;

public class Cipher_1 {
    public static void main(String[] args) {
        int blockSize = Cipher.getBlockSize("AES");
        System.out.println("The block size of AES is: " + blockSize);
    }
}

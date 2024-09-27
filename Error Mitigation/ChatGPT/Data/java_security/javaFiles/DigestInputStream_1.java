import java.io.*;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class DigestInputStream_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            MessageDigest md = MessageDigest.getInstance("MD5");
            DigestInputStream dis = new DigestInputStream(fis, md);

            int byteRead;
            while ((byteRead = dis.read()) != -1) {
                // Process the byte read
            }

            byte[] digest = md.digest();
            System.out.println("Digest: " + new String(digest));
            
            dis.close();
        } catch (IOException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

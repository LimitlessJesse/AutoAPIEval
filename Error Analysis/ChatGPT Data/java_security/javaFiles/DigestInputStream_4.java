import java.io.*;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class DigestInputStream_4 {
    public static void main(String[] args) {
        try {
            byte[] data = "Hello, World!".getBytes();
            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            MessageDigest md = MessageDigest.getInstance("MD5");
            DigestInputStream dis = new DigestInputStream(bais, md);
            
            byte[] buffer = new byte[1024];
            int bytesRead = dis.read(buffer, 0, buffer.length);
            
            System.out.println("Number of bytes read: " + bytesRead);
            System.out.println("Digest: " + md.digest());
            
            dis.close();
        } catch (IOException | java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

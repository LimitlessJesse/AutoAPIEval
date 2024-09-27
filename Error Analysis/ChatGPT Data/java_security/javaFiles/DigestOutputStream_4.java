import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestOutputStream_4 {
    public static void main(String[] args) {
        try {
            // Create MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Create ByteArrayOutputStream to hold the output
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            
            // Create DigestOutputStream with MessageDigest and ByteArrayOutputStream
            DigestOutputStream digestOutputStream = new DigestOutputStream(byteArrayOutputStream, md);
            
            // Write a byte to the DigestOutputStream
            digestOutputStream.write(65); // ASCII value of 'A'
            
            // Get the digest (hash value)
            byte[] digest = md.digest();
            System.out.println("MD5 hash: " + bytesToHex(digest));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Helper method to convert bytes to hexadecimal string
    private static final char[] hexArray = "0123456789ABCDEF".toCharArray();

    private static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}

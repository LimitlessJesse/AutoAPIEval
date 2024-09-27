import java.io.*;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class DigestInputStream_3 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("example.txt");
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            DigestInputStream digestInputStream = new DigestInputStream(inputStream, messageDigest);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = digestInputStream.read(buffer, 0, buffer.length)) != -1) {
                // Process the data read from the stream
            }

            byte[] digest = messageDigest.digest();
            System.out.println("Digest (MD5): " + bytesToHex(digest));

            digestInputStream.close();
        } catch (IOException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}

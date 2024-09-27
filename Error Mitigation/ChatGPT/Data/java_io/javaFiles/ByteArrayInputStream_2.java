import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_2 {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69}; // Sample data
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        
        byte[] buffer = new byte[3]; // Buffer to read data into
        int bytesRead;
        
        try {
            bytesRead = byteArrayInputStream.read(buffer, 0, 3);
            System.out.println("Bytes read: " + bytesRead);
            System.out.print("Data read: ");
            for (byte b : buffer) {
                System.out.print((char) b + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_2 {
    public static void main(String[] args) {
        byte[] byteArray = { 65, 66, 67, 68, 69 }; // Example byte array

        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        byte[] buffer = new byte[3]; // Create a buffer of size 3

        int bytesRead = bais.read(buffer, 0, 3); // Read bytes into buffer starting from index 0 with length 3
        
        System.out.println("Bytes read: " + bytesRead);
        for (int i = 0; i < bytesRead; i++) {
            System.out.println("Byte at index " + i + ": " + buffer[i]); // Print individual bytes read
        }
    }
}

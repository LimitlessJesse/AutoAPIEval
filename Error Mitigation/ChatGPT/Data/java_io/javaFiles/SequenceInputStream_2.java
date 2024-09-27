import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;
import java.io.InputStream;
import java.io.IOException;

public class SequenceInputStream_2 {
    public static void main(String[] args) {
        byte[] data1 = {65, 66, 67}; // ASCII values for A, B, C
        byte[] data2 = {68, 69, 70}; // ASCII values for D, E, F
        
        InputStream input1 = new ByteArrayInputStream(data1);
        InputStream input2 = new ByteArrayInputStream(data2);
        
        SequenceInputStream sequenceInput = new SequenceInputStream(input1, input2);
        
        byte[] buffer = new byte[5]; // Buffer to read 5 bytes
        
        try {
            int bytesRead = sequenceInput.read(buffer, 0, 5);
            System.out.println("Number of bytes read: " + bytesRead);
            System.out.print("Data read from input streams: ");
            for (byte b : buffer) {
                System.out.print((char) b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

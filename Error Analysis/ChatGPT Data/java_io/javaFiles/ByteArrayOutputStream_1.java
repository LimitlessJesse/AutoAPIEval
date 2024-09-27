import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStream_1 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        byte b = 65; // ASCII value for 'A'
        outputStream.write(b);
        
        byte[] byteArray = outputStream.toByteArray();
        for (byte value : byteArray) {
            System.out.println((char)value); // should print 'A'
        }
    }
}

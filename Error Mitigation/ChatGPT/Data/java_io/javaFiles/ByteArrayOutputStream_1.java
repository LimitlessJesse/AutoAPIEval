import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStream_1 {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        
        // Writing a byte to the ByteArrayOutputStream
        byteArrayOutputStream.write(65); // ASCII value for 'A'
        
        // Converting the written bytes to a string for display
        String result = new String(byteArrayOutputStream.toByteArray());
        System.out.println("Byte Array Output Stream: " + result);
    }
}

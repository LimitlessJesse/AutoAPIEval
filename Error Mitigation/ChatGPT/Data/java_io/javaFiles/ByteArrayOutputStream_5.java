import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStream_5 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write("Hello, World!".getBytes());
        
        byte[] byteArray = outputStream.toByteArray();
        
        for (byte b : byteArray) {
            System.out.print((char) b);
        }
    }
}

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStream_5 {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write("Hello, World!".getBytes());
        
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        
        for(byte b : byteArray) {
            System.out.println(b);
        }
    }
}

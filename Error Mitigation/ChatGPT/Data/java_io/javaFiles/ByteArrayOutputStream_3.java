import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStream_3 {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] data = {65, 66, 67, 68, 69}; // Sample byte array
        int offset = 1;
        int length = 3;
        
        byteArrayOutputStream.write(data, offset, length);
        
        byte[] result = byteArrayOutputStream.toByteArray();
        for (byte b : result) {
            System.out.print((char) b + " ");
        }
    }
}
